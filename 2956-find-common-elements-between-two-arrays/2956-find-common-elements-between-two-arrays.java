class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int i = 0;
        int n = nums1.length;
        int j = 0;
        int m = nums2.length;
        int first = 0;
        int second = 0;
        while(i < n){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            i++;
        }

        while(j < m){
            if(!map2.containsKey(nums2[j])){
                map2.put(nums2[j],1);
            }else{
                map2.put(nums2[j],map2.get(nums2[j])+1);
            }
            j++;
        }

        int k = 0;
        while(k < m){
            if(map.containsKey(nums2[k])){
                first++;
            }
            k++;
        }
        int l = 0;
        while(l < n){
            if(map2.containsKey(nums1[l])){
                second++;
            }
            l++;
        }
        int[] sol = new int[2];
        sol[1] = first;
        sol[0] = second;
        return sol;
    }
}