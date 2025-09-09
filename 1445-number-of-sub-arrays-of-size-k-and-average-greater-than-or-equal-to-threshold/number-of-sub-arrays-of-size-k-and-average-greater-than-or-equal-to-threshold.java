class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int n = arr.length;
        int j = 0;
        int sum = 0;
        int count = 0;
        while(j < n){
            sum +=arr[j];
            if(j - i + 1 > k){
                sum = sum - arr[i];
                i++;
            }
            if(j - i + 1 == k){
                int avg = sum/k;
                if(avg >= threshold){
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}