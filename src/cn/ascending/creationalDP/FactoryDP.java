package cn.ascending.creationalDP;

public class FactoryDP {
    private static Shoe createIns(String color,String size){
        Shoe s=new Shoe();
        s.setColor(color);
        s.setSize(size);
        return s;
    }

    public static void main(String[] args) {
        FactoryDP.createIns("black","big");
    }
}

class Shoe{
    private String color;
    private String size;

    //only generate set method
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
