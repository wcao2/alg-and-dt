package cn.ascending.ascendingAlgorithm;

public class Recursive {
    public int solution(int n){
        if(n<=1) return 1;
        return n*solution(n-1);
    }

    public static void main(String[] args) {
        Recursive r=new Recursive();
        System.out.println(r.solution(4));
    }
}
