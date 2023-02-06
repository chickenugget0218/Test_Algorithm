import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count=0; //answer

        //동전 입력받음
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        /* 최적해 찾기 -> K를 만들 때 최대값부터 들어가야 함
        * 큰 값부터 탐색해서 k보다 크면 넘어가고, 아니면 최대 개수를 더해주기 */
        for(int i = N-1; i>=0; i--){ //큰값부터 진행 - 5000, 4000
        if(arr[i] <= K){ //작거나 같아야지 저장이 됨
            count += (K/arr[i]);
            //현재 가치의 동전으로 구성할 수 있는 개수
            // 몫만 취함
            K = K % arr[i]; //나머지를 저장 -> 다시 나눠주기
            }
        }
        System.out.println(count);
    }
}