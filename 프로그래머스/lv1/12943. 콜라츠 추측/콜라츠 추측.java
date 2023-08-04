class Solution {
    public int solution(long num) {
        int answer = 0;
        while(true){
            if(num==1){
                break;
            }
            else{
                if(num%2==0){
                    num = num/2;
                }
                else{
                    num = (num*3) +1;
                }
                answer++;
                if(answer>=500){
                    answer = -1;
                    break;
                }
            }
        }
        return answer;
    }
}