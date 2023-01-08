import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0,length =nums.length; i<length; i++) {
			map.put(nums[i], nums[i]);
		}
		
		int answer = map.size()<nums.length/2 ? map.size() : nums.length/2;
        
        return answer;
    }
}