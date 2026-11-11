import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> temp = new ArrayList<>();
        
        temp.add(arr[0]);
        for (int i = 1 ; i < arr.length ; i ++ ) {
            if(arr[i] != arr[i-1]) {
                temp.add(arr[i]);
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for (int j = 0 ; j < temp.size() ; j++ ) {
            answer[j] = temp.get(j);
        }
        

        return answer;
    }
}