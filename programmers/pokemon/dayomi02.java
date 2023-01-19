import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if (map.size() < nums.length/2)
                map.put(nums[i], i);
        }
        answer = map.size();
        
        return answer;
    }
}