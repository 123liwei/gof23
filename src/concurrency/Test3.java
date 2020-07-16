package concurrency;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int start=0,end=0;end<n;end++){
            Character alpha = s.charAt(end);
            if(map.containsKey(alpha)){
                start = Math.max(map.get(alpha),start);
            }
            ans = Math.max(ans,end-start+1);
            map.put(alpha,end+1);
        }
        return ans;
    }
}