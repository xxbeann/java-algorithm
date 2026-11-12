import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int c = 0 ; c < commands.length ; c ++ ) {
            int l = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            int[] copy = Arrays.copyOfRange(array, l-1, j);
            
            while(true) {
                boolean flag = false;
                for (int i = 0 ; i < copy.length - 1; i ++ ) {
                    if(copy[i] > copy[i+1]) {
                        int temp = copy[i+1];
                        copy[i+1] = copy[i];
                        copy[i] = temp;
                        flag = true;
                    }
                }
                if(flag == false) break;
            }
            
            answer[c] = copy[k-1];
            
        }
        

        return answer;
    }
}