import java.util.HashMap;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer numIndex = hasMap.get(nums[i]);
            if (numIndex != null) {
                return new int[]{numIndex, i};
            }

<<<<<<< HEAD

    public static int[] twoSum(int[] nums, int target) {
        int[] pos = nums;
=======
            hasMap.put(target-nums[i], i);
        }   
>>>>>>> 0d6cf019e397458dec11f46a56e35bd478823364
        
        return nums;
    }
    
}