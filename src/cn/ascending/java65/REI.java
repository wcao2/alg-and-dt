package cn.ascending.java65;

public class REI {
//    public static int recursiveFun(int n){
//        if(n>=1){
//            return recursiveFun(n-1)*n;
//        }else{
//            return 1; // n +
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(REI.recursiveFun(3));
//    }
    public static String reverseFun(String str){
        char[] chars = str.toCharArray();
        String newStr="";
        for(int i=chars.length-1;i>=0;i--){
//            if(i<0){
//                break;
//            }
            newStr=newStr+chars[i];
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str=REI.reverseFun("abc");
        System.out.println(str);
    }
}
