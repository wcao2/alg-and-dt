package cn.ascending.java65.day03.test08;

/*
*  the solution to avoid deadlock is to reshuffle the pattern in which we are accessing the objects locks objectLock1 and objectLock2
*  in other words, just reverse the order in which we are passing the objectLock1 and ObjectLock2  either in Thread1 and Thread2 but not in both
* */
public class avoidDeadlock {
    static Object objectLock1=new Object();
    static Object objectLock2=new Object();

    private static class Thread1 extends Thread{
        @Override
        public void run(){
            synchronized (objectLock2){
                System.out.println("this is thread1: has objectlock1");
//                try{
//                    Thread.sleep(100);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
                System.out.println("Thread1 is waiting for objectLock2");

                synchronized (objectLock1){
                    System.out.println("Thread1: no deadblock");
                }
            }
        }
    }

    private static class Thread2 extends Thread{
        @Override
        public void run(){
            synchronized (objectLock2){
                System.out.println("this is thread2: has objectlock2");
//                try{
//                    Thread.sleep(100);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
                System.out.println("Thread2 is waiting for objectLock1");

                synchronized (objectLock1){
                    System.out.println("Thread2: no deadblock");
                }
            }
        }
    }
    public static void main(String args[]) {
        avoidDeadlock.Thread1 thread1 = new avoidDeadlock.Thread1();
        avoidDeadlock.Thread2 thread2 = new avoidDeadlock.Thread2();
        thread1.start();
        thread2.start();
    }
}
