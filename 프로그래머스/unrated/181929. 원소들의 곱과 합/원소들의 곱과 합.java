class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 0;
        for(int i=0;i<num_list.length;i++){
            sum+=num_list[i];
            if(mul==0){
                mul+=num_list[i];
            }else{
                mul*=num_list[i];
            }
            
        }
        return mul>sum*sum?0:1;
    }
}

