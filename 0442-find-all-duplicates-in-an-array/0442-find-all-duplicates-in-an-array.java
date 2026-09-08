class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < n){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                list.add(nums[i]);
            }
            i++;
        }
        return list;
    }
}