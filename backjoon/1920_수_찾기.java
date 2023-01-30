import java.io.*;
import java.util.*;

class Main {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 이진탐색 쓰니까 배열은 정렬되어 있어야 함
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        //검사
        for (int i = 0; i < M; i++) {
            //찾고자 하는 값이 있으면1, 없으면 0
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.print(sb);
    }

        public static int binarySearch ( int key){
            int left = 0;
            int right = arr.length - 1;

            //왼쪽이 오른쪽보다 커지기 전까지 반복한다
            while (left <= right) {
                //중간 위치
                int mid = (left + right) / 2;

                if (key < arr[mid]) { //key값이 중간보다 작을 경우
                    right = mid - 1;
                } else if (key > arr[mid]) { //key값이 중간보다 클 경우
                    left = mid + 1;
                } else { //key값과 mid위치의 값이 같을 경우
                    return mid;
                }
            }
            //찾고자 하는 값이 없음
            return -1;
        }
    }