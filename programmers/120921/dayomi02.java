class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if(A.equals(B)){
            return answer;
        }
        
        for(int i = 0; i < A.length(); i++){
            A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
            answer++;
            if(A.equals(B)){
                break;
            }
        }

        return answer == A.length() ? -1 : answer;
    }
}