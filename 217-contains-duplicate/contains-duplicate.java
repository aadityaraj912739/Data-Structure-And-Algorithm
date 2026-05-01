class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int n = nums.length;
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