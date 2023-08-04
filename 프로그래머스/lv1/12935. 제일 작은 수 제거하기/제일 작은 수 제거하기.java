import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[arr.length-1];
            int min = Integer.MAX_VALUE;
            ArrayList<Integer> arraylist = new ArrayList<>();
            for(int i:arr){
                min = Math.min(min,i);
            }
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=min){
                    arraylist.add(arr[i]);
                }
            }
            
            for(int i=0;i<arraylist.size();i++){
                answer[i] = arraylist.get(i);
            }
            
            
        }
        return answer;
    }
}