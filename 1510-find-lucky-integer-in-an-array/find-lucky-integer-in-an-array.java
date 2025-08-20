class Solution {
    public int findLucky(int[] arr) {
        int i = 0;
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(i < n){
            int val = arr[i];
            if(!map.containsKey(val)){
                map.put(val,1);
            }else{
                map.put(val,map.get(val)+1);
            }
            i++;
        }
        int j = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(j < n){
            if(!map.containsKey(arr[j])){
                j++;
                continue;
            }
            int val = map.get(arr[j]);
            if(arr[j] == val){
                map.remove(arr[j]);
                count++;
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            j++;
        }
        if(count == 0){
            return -1;
        }else{
            return max;
        }
    }
}