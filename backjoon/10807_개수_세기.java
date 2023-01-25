import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] nums = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        //입력받아서 배열에 저장
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        //찾을변수
        int find = Integer.parseInt(bf.readLine());
        int cnt=0; //카운터

        for(int i=0; i< nums.length; i++){
            //for-each는 배열요소 전부 출력할때만 사용할것
            if(nums[i] == find){
                cnt++;
            }
        }
        System.out.println(cnt);
        bf.close();
    }
}

