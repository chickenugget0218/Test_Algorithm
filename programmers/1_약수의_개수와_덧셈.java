import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0; //약수개수
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for( ; left <= right ; left++){
            cnt = 0;
            for (int i=1; i <= left; i++){
                if (left%i==0){
                    cnt +=1;
                }   
            }
            list.add(cnt);
            if (cnt%2==0){
                answer = answer + left;
            }
            else{
                answer = answer - left;
            }
        }
    
        return answer;
    }
}