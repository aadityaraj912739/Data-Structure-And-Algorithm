class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i = 0; 
        int j = 1;
        int n = nums.length;
        while(i < n-1){
            j = i+1;
            while(j < n){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                
                j++;
            }
            i++;
        }
        return arr;
    }
}