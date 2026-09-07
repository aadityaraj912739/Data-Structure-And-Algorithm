class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int n = nums.length;
        if(n % 2 != 0){
            return false;
        }
        while(i < n){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
            }
            i++;
        }
        if(set.isEmpty()){
            return true;
        }
        return false;
    }
}