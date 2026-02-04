class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int i = 0;
        while(i < n){
            nums[i] = nums[i]*nums[i];
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }
}