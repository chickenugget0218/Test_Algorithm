import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        String str = "수박";
        int x = 0;
        int y = 0;
        if(n%2==0){
            x = n/2; //몫
            answer = str.repeat(x);
            return answer;
        }
        else{
            x = n/2; //홀수
            y = n%2; //나머지
            answer = str.repeat(x)+str.charAt(0);
        }
        return answer;
    }
}