
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 입력으로 받는 값들을 저장하기 위한 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 한줄 입력
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int A;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A = Integer.parseInt(st1.nextToken());
            if(A<X){
                System.out.print(A+" ");
            }
        }
    }
    }
