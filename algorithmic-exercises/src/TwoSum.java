public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        for (int firstIndex = 0; firstIndex < nums.length-1; firstIndex++) {
            for (int secondIndex = firstIndex+1; secondIndex < nums.length; secondIndex++) {
                if(target - nums[firstIndex] == nums[secondIndex]) {
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }
        return null;
    }
}
