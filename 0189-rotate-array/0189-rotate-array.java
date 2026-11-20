class Solution {
    public int[] sort(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        k = k % n;
        sort(nums,i,n-1);
        sort(nums,i,k-1);
        sort(nums,k,n-1);
    }
}