class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] result = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        //SUN=3, MON=4, TUE=5, WED=6, THU=7, FRI=1, SAT=2
        int days = 0;
        
        for (int i = 0; i < a-1; i++){
            days += day[i];
        }
        days = days + b;
        return result[--days%7];
    }
}