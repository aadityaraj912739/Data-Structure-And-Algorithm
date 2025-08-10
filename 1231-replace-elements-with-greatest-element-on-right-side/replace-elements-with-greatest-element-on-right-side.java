class Solution {
    public int[] replaceElements(int[] arr) {
        int i = 0;
        int n = arr.length;
        int j = n-1;
        int []ans = new int[n];
        while(i < n){
            j = i+1;
            int max = Integer.MIN_VALUE;
            while(j < n){
                if(max < arr[j]){
                    max = arr[j];
                }
                j++;
            }
            if(i == n-1){
                ans[i] = -1;
            }else{
                ans[i] = max;
            }
            i++;
        }
        return ans;
    }
}