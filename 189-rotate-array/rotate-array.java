class Solution {
    public static int[] rt(int[] num, int i, int j) {
        while (i < j) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        return num;
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k >= n) {
            k = k % n;
        }
        int[] rt = rt(nums, 0, n - 1);
        rt(rt, 0, k - 1);
        rt(rt, k, n - 1);
        

    }
}