package cn.ascending.creationalDP;

public class BuildDP {
    private String name;
    private int age;
    private String address;
    public BuildDP(UserBuilder ub){
        this.name=ub.name;
        this.age=ub.age;
        this.address=ub.address;
    }

    //inner class
    public static class UserBuilder{
        private String name;
        private int age;
        private String address;
        //mandatory parameter
        public UserBuilder(String name){
            this.name=name;
        }
        //customization optional parameter
        public UserBuilder age(int age){
            this.age=age;
            return this;
        }
        public UserBuilder address(String address){
            this.address=address;
            return this;
        }
        public BuildDP build(){
            BuildDP ub=new BuildDP(this);
            return ub;
        }
    }

    public static void main(String[] args) {
        new UserBuilder("Wei").age(25).address("xxx").build();
    }
}

