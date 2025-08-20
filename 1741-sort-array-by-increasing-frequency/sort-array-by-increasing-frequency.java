class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while(i < n){
            int val = nums[i];
            if(!map.containsKey(val)){
                map.put(val,1);
            }else{
                map.put(val,map.get(val)+1);
            }
            i++;
        }
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b - a;  // same frequency → larger number first
            }
            return map.get(a) - map.get(b); // smaller frequency first
        });

        int[] ans = new int[n];
        int j1 = 0;
        for(int i1 : list){
            int count = map.get(i1);
            while(count > 0){
                ans[j1] = i1;
                count--;
                j1++;
            }
        }
        return ans;
    }
}