class Solution {
    public boolean checkIncreasing(int[] arr){
        int i = 0;
        int n = arr.length;
        int f= 0;
        while(i < n-1){
            if(arr[i] <= arr[i+1]){
                f++;
            }else{
                return false;
            }
            i++;
        }
        return true;

    }
    public boolean checkDecreasing(int[] arr){
        int i = 0;
        int n = arr.length;
        int f= 0;
        while(i < n-1){
            if(arr[i] >= arr[i+1]){
                f++;
            }else{
                return false;
            }
            i++;
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        Boolean checkIncreasing = checkIncreasing(nums);
        Boolean checkDecreasing = checkDecreasing(nums);
        if(checkIncreasing || checkDecreasing){
            return true;
        }

        return false;
    }
}