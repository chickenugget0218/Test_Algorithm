
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 입력으로 받는 값들을 저장하기 위한 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 한줄 입력
        int N = Integer.parseInt(st.nextToken()); //n
        int T = Integer.parseInt(st.nextToken()); //time

        int sum = 0; // 시간 합
        int cnt = 0; //일의 개수

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        //배열에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        // 다 더하기
        for (int i : arr) {
            sum += i;
            if (sum > T) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
