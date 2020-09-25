package cn.ascending.creationalDP;

public class SingletonEager {
    private SingletonEager(){

    }
    private static final SingletonEager ins=new SingletonEager();
    public static SingletonEager getIns(){
        return ins;
    }
}
