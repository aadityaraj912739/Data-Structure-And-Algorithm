class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        int[] ans = new int[n];
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        while(i < n){
            if(nums[i] % 2 == 0){
                ans[j] = nums[i];
                set.add(i);
                j++;
            }
            i++;
        }
        int k = 0;
        while(k < n && j < n){
            if(!set.contains(k)){
                ans[j] = nums[k];
                j++;
            }
            k++;
            
        }
        return ans;
        
    }
}