class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            i++;
        }
        int j = 0;
        int ans = -1;
        while(j < n){
            if(map.get((nums[j])) == 1){
                ans = nums[j];
            }
            j++;
        }
        return ans;
    }
}