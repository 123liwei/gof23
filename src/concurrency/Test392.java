package concurrency;

public class Test392 {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean flag = isSubsequence(s,t);
        System.out.println(flag);
    }

    public static boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c, index+1);
            if (index == -1) return false;
        }
        return true;
    }

}
