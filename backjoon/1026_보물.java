import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i< n ;i++){ //a
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a); //오름차순
        StringTokenizer sr = new StringTokenizer(br.readLine());
        for(int i=0; i< n ;i++){ //a
            b[i] = Integer.parseInt(sr.nextToken());
        }
        //integer 배열 생성 - int형 배열 내림차순 불가
        Integer[] b2 = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(b2, Collections.reverseOrder()); //내림차순 정렬
        int sum=0;
        for(int i=0; i< a.length; i++){
            sum += a[i]*b2[i];
        }
        System.out.print(sum);
    }
}