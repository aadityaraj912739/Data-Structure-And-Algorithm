class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> qless = new LinkedList<>();
        Queue<Integer> qequal = new LinkedList<>();
        Queue<Integer> qmore = new LinkedList<>();
        int i = 0;
        int n = nums.length;
        while(i < n){
            int val = nums[i];
            if(val < pivot){
                qless.add(val);
            }else if(val == pivot){
                qequal.add(val);
            }else{
                qmore.add(val);
            }
            i++;   
        }
        int[] ans = new int[n];
        int it = 0;
        while(!qless.isEmpty()){
            ans[it]= qless.poll();
            it++;
        }
        while(!qequal.isEmpty()){
            ans[it]=qequal.poll();
            it++;
        }
        while(!qmore.isEmpty()){
            ans[it]=qmore.poll();
            it++;
        }
        return ans;
    }
}