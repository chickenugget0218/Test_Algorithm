import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>(); //int로 받음
        while(n>0){
            arr.add(n%10);
            n /= 10;
        }
        arr.sort(Comparator.reverseOrder()); //내림차순 정렬
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < arr.size() ; i++){
            sb.append(arr.get(i));
        }
        System.out.print(sb);
    }
}