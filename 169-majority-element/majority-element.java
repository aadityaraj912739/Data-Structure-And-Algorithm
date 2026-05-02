class Solution {
    public int majorityElement(int[] nums) {
        int i = 0;
        int n = nums.length;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (i < n) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            i++;
        }
        int j = 0;
        int ans = 0;
        while(j < n){
            int freq = map.get(nums[j]);
            if(max < freq){
                max = freq;
                ans = nums[j];
            }
            j++;
        }
        return ans;
    }
}