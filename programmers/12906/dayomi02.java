import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i = arr.length-1; i > -1; i--){
            if (i == arr.length-1){
                stack.push(arr[i]);
            } else{
                if(arr[i] != stack.peek()){
                    stack.push(arr[i]);
                }
            }
        }

        answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = stack.peek();
            stack.pop();
        }
 
        return answer;
    }
}