import java.util.*;
class Solution_1 {
    public char[] solution(int n, int[][] ladder){
        char[] answer = new char[n];
        for(int i=1;i<=n;i++){
            int num = i;
            for(int j=0;j<ladder.length;j++){
                for(int k=0;k<ladder[j].length;k++){
                    if(num==ladder[j][k]||num==ladder[j][k]){
                        num++;
                    }else if(num==ladder[j][k]+1||num==ladder[j][k]+1){
                        num--;
                    }
                }
            }
            answer[num-1]=(char) (i+64);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution_1 T = new Solution_1();
        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }
}
