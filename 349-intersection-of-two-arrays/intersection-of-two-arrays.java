class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int n = nums1.length;
        while(i < n){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
            i++;
        }

        int j = 0;
        while(j < nums2.length){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
            j++;
        }
        int m = list.size();
        int [] ans = new int[m];
        int j1 = 0;
        for(int i1 : list){
            ans[j1] = i1;
            j1++;
        }
        return ans;


    }
}