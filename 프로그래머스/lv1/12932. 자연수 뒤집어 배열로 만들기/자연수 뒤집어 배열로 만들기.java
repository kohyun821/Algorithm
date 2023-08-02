class Solution {
    public int[] solution(long n) {
        int[] answer = new int [Long.toString(n).length()];
        for(int i = 0;i<answer.length;i++){
            answer[i] = Long.valueOf(n%10).intValue();
            n = n/10;
        }
        return answer;
    }
}