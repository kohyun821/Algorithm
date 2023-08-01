class Solution {
    public int solution(int[] num_list) {
        String odd = "";//홀
        String even = "";//짝
        
        for(int i : num_list){
            if(i%2==0){
                even+=i;
            }
            if(i%2==1){
                odd+=i;
            }
        }
        int answer = Integer.parseInt(odd)+Integer.parseInt(even);
        return answer;
    }
}