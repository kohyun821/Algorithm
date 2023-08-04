import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i:arr){
            if(i%divisor==0){
                arraylist.add(i);
            }
        }if(arraylist.size() == 0){
            arraylist.add(-1);
        }
        int[] answer =new int[arraylist.size()];
        
        for(int i=0; i<arraylist.size();i++){
            answer[i] = arraylist.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}