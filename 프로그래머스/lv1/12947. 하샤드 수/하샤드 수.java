class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x2 = x;
        int sum = 0;
        while(true){
            if(x2<=0){
                break;
            }
            sum += x2%10;
            x2 = x2/10;
        }
        
        if(x%sum==0){
            System.out.println("if"+x+" / "+sum);
            answer = true;
        }else{
            System.out.println("else"+x+" / "+sum);
            answer = false;
        }
        return answer;
    }
}