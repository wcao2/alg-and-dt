package cn.ascending.java65.day02;

// How to Count number of words in the String?
public class test05 {
    static int i,c=0,res;

    static int wordCount(String s){
        char ch[]=new char[s.length()];
        for(i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
            // 当不是首字母时 || 后面针对首word
            if(( (i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0))){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        res=test05.wordCount("a  asd asd asd asd");
        System.out.println(res);
    }
}
