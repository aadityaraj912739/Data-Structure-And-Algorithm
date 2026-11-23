class Solution {
    public int singleNonDuplicate(int[] nums) {
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
        while(j < n){
            if(map.containsKey(nums[j])){
                int val = map.get(nums[j]);
                if(val == 1){
                    return nums[j];
                }
            }
            j++;
        }
        return -1;
    }
}