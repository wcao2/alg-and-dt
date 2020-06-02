package cn.ascending.java65.day03.test08;


/*
*   当两个或两个以上的线程在执行过程中，因为争夺资源而造成的一种相互等待的状态，
*   由于存在一种环路的锁依赖关系而永远地等待下去，如果没有外部干涉，他们将永远等待下去，此时的这个状态称之为死锁。
* */
public class Deadlock {
    static Object objectLock1=new Object();
    static Object objectLock2=new Object();

    private static class Thread1 extends Thread{
        @Override
        public void run(){
            //synchronized代码块时会锁定当前的对象(objectLock1)，只有执行完该code block才能释放该对象锁，下一个线程才能执行并锁定该对象
            synchronized (objectLock1){
                    System.out.println("Thread1: Has ObjectLock1");
                try{
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }

                System.out.println("Thread1 is waiting for objectLock2");
                //Thread1 has ObjectLock1 but waiting for ObjectLock2
                synchronized (objectLock2){
                    System.out.println("Thread1: No Deadlock");
                }
            }
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (objectLock2) {
                System.out.println("Thread2: Has  ObjectLock2");
            /* Adding sleep() method so that
               Thread 1 can lock ObjectLock1 */
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2: is waiting for ObjectLock 1");
            /*Thread 2 has ObjectLock2
              but waiting for ObjectLock1*/
                synchronized (objectLock1) {
                    System.out.println("Thread2: No DeadLock");
                }
            }
        }
    }

    public static void main(String args[]) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}
