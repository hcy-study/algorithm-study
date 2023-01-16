import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        Queue<Character> queue = new LinkedList<Character>();
        queue.offer(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            
            if(queue.peek()==null||queue.peek()==s.charAt(i)){
                queue.offer(s.charAt(i));
            }
            else{
                if(queue.poll()==')') return false;
            }
        }
        return queue.size()==0;
    }
}