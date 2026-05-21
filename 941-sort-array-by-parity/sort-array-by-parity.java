class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int n = nums.length;
        Stack<Integer> s = new Stack();
        while(i < n){
            if(nums[i] % 2 == 0){
                s.push(nums[i]);
            }
            i++;
        }
        int j = 0;
        int [] arr = new int[n];
        int k = s.size();
        while(j < n && !s.isEmpty()){
            arr[j] = s.pop();
            j++; 
        }
        int p = 0;
        while(k < n && p < n){
            if(nums[p] % 2 != 0){
                arr[k] = nums[p];
                k++;
            }
            p++;
        }
        return arr;

    }
}