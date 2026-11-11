import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        
        temp.add(arr[0]);
        for (int i = 1 ; i < arr.length ; i ++ ) {
            if(arr[i] != arr[i-1]) {
                temp.add(arr[i]);
            }
            //System.out.println(temp);
        }

        return temp;
    }
}