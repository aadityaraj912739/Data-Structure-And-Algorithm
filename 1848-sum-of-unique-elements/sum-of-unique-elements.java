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

        int j = 0;
        while(j < n){
            if(map.containsKey(nums[j]) && map.get(nums[j]) == 1){
                sum = sum + nums[j];
            }
            j++;
        }
        return sum;
    }
}