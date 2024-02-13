import java.util.HashMap;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer numIndex = hasMap.get(nums[i]);
            if (numIndex != null) {
                return new int[]{numIndex, i};
            }

            hasMap.put(target-nums[i], i);
        }   
        
        return nums;
    }
    
}