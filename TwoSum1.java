import java.util.HashMap;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
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

    public static void main(String[] args) {
        int[] arr = {15, 11, 1, 3};
        int[] temp = twoSum(arr, 4);

        System.out.println("Target index: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" " + temp[i]);    
        }
        
    }
}