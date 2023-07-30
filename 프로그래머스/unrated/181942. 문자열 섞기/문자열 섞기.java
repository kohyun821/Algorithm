class Solution {
    public String solution(String str1, String str2) {
        String str3="";
        for(int i=0;i<str1.length();i++){
            str3 += str1.charAt(i);
            str3 += str2.charAt(i);
        }
        return str3;
    }
}