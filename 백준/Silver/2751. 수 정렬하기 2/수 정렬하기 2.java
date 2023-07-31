import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //int arr[] = new int[N];
        for (int i=0;i<N;i++){
            //arr[i]= sc.nextInt();
            list.add(sc.nextInt());
        }
        
         sc.close();
        
        Collections.sort(list);
        /*
        
        for (int i=0;i<N;i++){
        //System.out.println(arr[i]);
            System.out.println(list.get(i));
        }
        
        */
        StringBuilder sb = new StringBuilder();
        
        for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
    }
}