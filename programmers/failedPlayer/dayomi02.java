import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<Integer, String> map = new HashMap<>();
        List<String> removeList = new ArrayList<>();
        
        for (int i = 0; i < participant.length; i++){
            map.put(i, participant[i]);
        }
        
        for (int j = 0; j < completion.length; j++){
            if(map.containsValue(completion[j])){
                removeList.add(completion[j]);
            }
        }

        for (String value : map.values()){
            if(removeList.contains(value)){
                removeList.remove(value);
            } else{
                answer += value;
            }
        }
        
        return answer;
    }
}