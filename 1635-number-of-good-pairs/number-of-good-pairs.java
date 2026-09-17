class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                res = res + map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
                
            }
            i++;
        }
        return res;
    }
}