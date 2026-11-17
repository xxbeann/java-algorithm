import java.util.*;

class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    // index 지금 부호를 정할 숫자의 위치, sum: 지금까지 더한 값
    void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if(sum == target) {
                answer ++;
            }
            return;
        }
        dfs(numbers, target, depth +1, sum + numbers[depth]);
        dfs(numbers, target, depth +1, sum - numbers[depth]);
    }
}