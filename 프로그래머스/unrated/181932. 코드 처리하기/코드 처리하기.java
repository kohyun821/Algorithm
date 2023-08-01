class Solution {
    public String solution(String code) {
         int mode=0;
        String answer = "";

        for(int i=0;i<code.length();i++){

            if(mode == 0 && code.charAt(i)=='1'){
                mode = 1;
            }

            else if(mode == 0 && code.charAt(i)!='1'){
                if(i%2==0){
                    answer+=code.charAt(i);
                }
            }

            else if(mode == 1 && code.charAt(i)=='1'){
                mode = 0;
            }

            else if(mode == 1 && code.charAt(i)!='1'){
                if(i%2==1){
                    answer+=code.charAt(i);
                }
            }

        }
        if(answer.length()==0){
            answer="EMPTY";
        }
        return answer;
    }
}