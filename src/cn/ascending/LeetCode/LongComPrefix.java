package cn.ascending.LeetCode;

//14
public class LongComPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            //后面str每一项和第一个逐一比较
            for (int j = 1; j < strs.length; j ++) {
                if (strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] str={"abc","sdc1","abc2"};
        System.out.println(longestCommonPrefix(str));
    }
}
