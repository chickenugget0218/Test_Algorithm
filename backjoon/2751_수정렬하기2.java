import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* array쓰면 시간초과, arraylist 써서 Collection.sort 사용함 
         * collection의sort는 tim sort로 o(n) ~ nlogn 사이임 
         * Arrays.sort()는 O(n^2) 라서 시간초과 */
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr); //정렬

        for(int x:arr){
            sb.append(x).append('\n');
        }
        System.out.println(sb);
    }
}