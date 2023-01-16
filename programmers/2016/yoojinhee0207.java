class Solution {
    public String solution(int a, int b) {
       String[] answer= {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int n=0;
		for(int i=1; i<a; i++) {
			switch(i) {
			case 1:case 3:case 5: case 7: case 8: case 10: case 12: n+=31;break;
			case 4: case 6: case 9: case 11: n+=30; break;
			case 2: n+=29; break;
			}
		}
		n+=b-1;
		return answer[n%7];
    }
}