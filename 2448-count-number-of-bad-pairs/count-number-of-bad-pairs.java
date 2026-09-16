class Solution {
    public long countBadPairs(int[] nums) {
        int i = 0;
        int n = nums.length;
        int [] arr = new int[n];
        while(i < n){
            arr[i] = nums[i] - i;
            i++;
        }
        int j = 0;
        int totalPair = 0;
        int goodPair = 0;
        long res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j < n){
            totalPair = j;
            goodPair = 0;
            int badPair = 0;
            if(!map.containsKey(arr[j])){
                map.put(arr[j],1);
            }else{
                goodPair = map.get(arr[j]);
                map.put(arr[j],map.get(arr[j])+1);
            }
            badPair = totalPair - goodPair;
            res = res + badPair;
            j++;

        }
        return res;
    }
}