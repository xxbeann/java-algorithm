class Solution {
    public int solution(int n, int k) {
        int serviceCount = n/10;
        int answer = 0;
        if (serviceCount >= 1) {
            answer = (n*12000) + (2000*(k-serviceCount));
        } else {
            answer = (n*12000) + (2000*k);
        }
        return answer;
    }
}