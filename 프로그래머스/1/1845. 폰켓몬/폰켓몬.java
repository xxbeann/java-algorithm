import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int half = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
    
        int answer = Math.min(half, set.size());
        
        return answer;
    }
}