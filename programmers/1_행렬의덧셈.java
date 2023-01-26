import java.util.*;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //속배열 - arr2의 원소개수만큼 할당
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i =0; i < arr1.length; i++){ //세로
            for(int j=0; j < arr1[i].length; j++){ //가로(속배열)
                answer[i][j] = arr1[i][j] + arr2[i][j];        
            }
        }
        return answer;
    }
}