class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        int occ = 1;
        
        while(i < n){
            if(nums[i] == x){
                map.put(occ,i);
                occ++;
            }
            i++;
        }
        int j = 0;
        int m = queries.length;
        int[] ans = new int[m];
        while(j < m){
            if(map.containsKey(queries[j])){
                ans[j] = map.get(queries[j]);
            }else{
                ans[j] = -1;
            }
            j++;
        }
        return ans;
    }
}