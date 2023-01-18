import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //여기에 있어야함
        StringTokenizer st = new StringTokenizer(br.readLine());
        //int쓰지말고 long, long이 int보다 메모리 2배 사용
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        System.out.println(Math.abs(n-m));
    }
}
