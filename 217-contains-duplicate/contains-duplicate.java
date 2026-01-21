class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
            i++;
        }
        return false;
    }
}