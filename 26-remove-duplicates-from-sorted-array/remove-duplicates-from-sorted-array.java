class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < n && j < n){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[j] = nums[i];
                count++;
                i++;
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
}