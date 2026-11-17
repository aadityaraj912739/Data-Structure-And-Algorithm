class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n  = nums.length;
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                return true;
            }
            i++;
        }
        return false;
    }
}