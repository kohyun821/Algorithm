import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        answer = min+" "+max;
        return answer;
    }
}