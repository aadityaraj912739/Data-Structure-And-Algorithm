class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;           
        int n = nums.length;
        int count = 0;       

        while (i < n) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[count] = nums[i]; 
                count++;
            }
            i++;
        }
        return count; 
    }
}
