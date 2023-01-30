import java.io.*;
import java.util.*;

class Main { /*메모리초과 stringbuilder쓸것 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //정렬
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
}