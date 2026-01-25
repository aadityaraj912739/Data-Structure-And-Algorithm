class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = arr.length;
        while(i < n){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
            i++;
        }
        int min =  Integer.MIN_VALUE;
        int ans = -1;
        int j = 0;
        while(j < n){
            if(arr[j] == map.get(arr[j])){
                if(arr[j] > ans){
                    ans  = arr[j];
                }
            }
            j++;
        }
        return ans;

    }
}