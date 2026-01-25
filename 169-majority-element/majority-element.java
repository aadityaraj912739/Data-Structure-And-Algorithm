class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            i++;
        }
        int maj = n / 2;
        int ans = -1;
        int j = 0;
        while(j < n){
            if(map.get(nums[j]) > maj){
                return nums[j];
            }
            j++;
        }
        return ans;
    }
}