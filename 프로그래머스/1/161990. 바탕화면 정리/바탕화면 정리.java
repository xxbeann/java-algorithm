import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<Integer> cols = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        
        for(int i = 0 ; i < wallpaper.length ; i ++ ) {
            // System.out.println(wallpaper[i]);
            for (int j = 0 ; j < wallpaper[i].length(); j ++ ){
                // System.out.println(wallpaper[i].charAt(j) == '#');
                if(wallpaper[i].charAt(j) == '#') {
                    cols.add(j);
                    rows.add(i);
                }
            }
        }
        
        // System.out.println(cols); // 1,2,3 3+1(right) 1(left)
        // System.out.println(rows); // 0,1,2 2+1(bottom) 0(top)
        
        int top = Collections.min(rows);
        //System.out.println(top);
        int left = Collections.min(cols);
        //System.out.println(left);
        int bottom = Collections.max(rows) + 1;
        //System.out.println(bottom);
        int right = Collections.max(cols) + 1;
        
        //int[] answer = {};
        int[] answer = {top, left, bottom, right};
        return answer;
    }
}