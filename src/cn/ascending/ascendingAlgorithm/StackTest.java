package cn.ascending.ascendingAlgorithm;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<Integer>();
//        //1:add value to stack
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack);
//        //2:view the object at the top of stack
//        System.out.println(stack.peek());
//        //3:Remove the object at the top of the stack and return the object as the value of this function
//        System.out.println(stack.pop());
//        System.out.println("to get the first element in stack: "+stack.get(0));
//        System.out.println(stack);
        String[] arr={"1","2","+","D","C"};
        int num=StackTest.getPoints(arr);
        System.out.println(num);
    }

    public static int getPoints(String[] eles){
        Stack<Integer> stack = new Stack<Integer>();
        for(String ele:eles){
            if(ele.equals("+")){
                int top=stack.pop();
                int newTop=top+stack.peek();
                stack.push(top);//加法算完放回去
                stack.push(newTop);
            }else if(ele.equals("C")){
                stack.pop();
            }else if(ele.equals("D")){
                stack.push(2*stack.peek());
            }else{
                stack.push(Integer.valueOf(ele));
            }
        }
        int answer=0;
        for(int score:stack){
            answer+=score;
        }
        return answer;
    }
}
