class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            i++;
        }
        map.forEach((key, value) -> {
            if(3*value > n){
                list.add(key);
            }
        });
        return list;
    }
}