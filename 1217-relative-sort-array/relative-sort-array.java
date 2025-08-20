class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = arr1.length;
        int[] nums = new int[n];
        while(i < n){
            int val = arr1[i];
            if(!map.containsKey(val)){
                map.put(val,1);
            }else{
                map.put(val,map.get(val)+1);
            }
            i++;
        }

        int j = 0;
        int m = arr2.length;
        int j1 = 0;

        if(m == 0){
            return arr1;
        }
        while(j < m){
            int val = arr2[j];
            if(!map.containsKey(val)){ 
                j++;
                continue;
            }
            int n1 = map.get(val);
            while(n1 > 0){
                nums[j1] = val;
                j1++;
                n1--;
            }
            map.remove(val); 
            j++;
        }
        ArrayList<Integer> leftovers = new ArrayList<>(map.keySet());
        Collections.sort(leftovers);

        for(int key : leftovers){
            int cnt = map.get(key);
            while(cnt > 0){
                nums[j1] = key;
                j1++;
                cnt--;
            }
        }

        return nums;
    }
}
