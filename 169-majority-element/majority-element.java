class Solution {
    public int majorityElement(int[] nums) {
        int i = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            i++;
        }
        int max = 0;
        int j = 0;
        int ans = -1;
        while(j < n){
            if(map.containsKey(nums[j])){
                int val = map.get(nums[j]);
                if(val > max){
                    max = val;
                    ans = nums[j];
                }
            }
            j++;
        }
        return ans;
    }
}