class Solution {
    boolean solution(String s) {
        int num_p=0;
        int num_y=0;
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                num_p++;
            }
               
            if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                num_y++;
            }
        }

        return num_p ==num_y?true:false;
    }
}