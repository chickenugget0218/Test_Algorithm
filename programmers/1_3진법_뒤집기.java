class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans="";
        //10진법 -> 3진법
        while(n != 0){ //n을 3으로 나눈다
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans,3); //String을 문자로 변경
    }
}