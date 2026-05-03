import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        int count = 0;
        while (i < n) {
            if (map.containsKey(nums[i])) {
                count = count + map.get(nums[i]);
            }
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);

            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            i++;
        }
        return count;
    }
}