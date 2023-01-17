
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 입력으로 받는 값들을 저장하기 위한 ㅕㄴ수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N,M;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        System.out.println(gcd(N,M));
        System.out.println(lcm(N,M));
    }
    static int gcd(int a, int b){ //최대공약수
        if(a<b){
            int temp =a;
            a = b;
            b = temp;
        }
        while (b != 0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b){ //최소공배수
        return a*b / gcd(a,b);
    }
    }