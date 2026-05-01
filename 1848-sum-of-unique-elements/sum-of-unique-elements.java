class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        int sum = 0;
        while (i < n) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            i++;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer freq = entry.getValue();
            Integer value = entry.getKey();
            if (freq == 1) {
                sum = sum + value;
            }

        }
        return sum;
    }
}