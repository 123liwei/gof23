package concurrency;

public class Ji5 {

    public static void main(String[] args) {
        String s = "We are happy.";
        String res = replaceSpace(s);
        System.out.println(res);
    }

    public static String replaceSpace(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        String str = s.replace(" ","%20");
        return str;
    }

}
