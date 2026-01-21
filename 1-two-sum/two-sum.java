class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int i = 0;
        int[] ans = new int[2];
        while(i < n){
            int val = target-nums[i];
            if(!map.containsKey(val)){
                map.put(nums[i],i);
            }else{
                ans[0] = i;
                ans[1] = map.get(val);
            }
            i++;
        }
        return ans;
    }
}