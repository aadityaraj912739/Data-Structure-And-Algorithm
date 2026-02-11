class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        while(j < n){
            if(Math.abs(i-j) > k){
                set.remove(nums[i]);
                i++;
            }
            
            if(Math.abs(i-j) <= k){
                if(!set.contains(nums[j])){
                set.add(nums[j]);
                }else{
                    return true;
                }
                
            }
            j++;
        }
        return false;
    }
}