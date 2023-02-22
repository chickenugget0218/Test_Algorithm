import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int n =Integer.parseInt(br.readLine());
        int sum=0;

        for(int i =0; i<n; i++){
            int nums = Integer.parseInt(br.readLine());
            if(nums ==0){
                stack.pop();
            }
            else{
                stack.push(nums);
            }
        }
        if(stack.isEmpty()){
            System.out.print(0);
        }
        else{
            for (Integer integer : stack) {
                sum += integer;
            }
            System.out.print(sum);
        }
    }
}