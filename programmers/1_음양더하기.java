import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i < absolutes.length; i++){         
            if (signs[i] == true){ // 양수이면
                answer += absolutes[i];
            }
            else{
                int swap = 0;
                swap -= absolutes[i];
                answer += swap;
            }
        }        
        return answer;
    }
}