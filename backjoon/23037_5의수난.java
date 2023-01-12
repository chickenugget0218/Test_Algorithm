
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();

        String[] nums = n.split(""); //한글자씩 자름

        int[] arr = new int[5];
        int sum =0;
        int n1=0;

        for(int i =0; i<5 ;i++){
            arr[i] = Integer.parseInt(nums[i]);
            n1 = (int) Math.pow(arr[i],5);
            sum += n1;

        }
        System.out.println(sum);
    }
}