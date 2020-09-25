package cn.ascending.creationalDP;

public class SingletonLazy {
    private static SingletonLazy ins;
    private SingletonLazy(){

    }
    public static SingletonLazy getIns(){
        if(ins!=null){
            return ins;
        }else {
            ins=new SingletonLazy();
            return ins;
        }
    }
}
