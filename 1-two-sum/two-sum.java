class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        int[] ans = new int[2];
        while(i < n){
            if(!map.containsKey((target-nums[i]))){
                map.put(nums[i],i);
            }else{
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }
            i++;
        }
        return ans;
    }
}