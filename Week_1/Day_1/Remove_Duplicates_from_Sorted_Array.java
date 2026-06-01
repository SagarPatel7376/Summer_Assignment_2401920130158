class Solution {
    public static int removeDuplicates(int[] nums) {
        int pointer = 0, expected = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > expected){
                nums[pointer] = nums[i];
                expected = nums[i];
                pointer++;
            }
        }
        return pointer;
    }
}
