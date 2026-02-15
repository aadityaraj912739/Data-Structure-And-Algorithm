class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int n = fruits.length;
        int size = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < n) {
            if (!map.containsKey(fruits[j])) {
                map.put(fruits[j], 1);
            } else {
                map.put(fruits[j], map.get(fruits[j]) + 1);
            }
            if (map.size() > 2) {
                if (fruits[i] == fruits[j]) {
                    map.put(fruits[i], map.get(fruits[i]) - 1);
                    i++;
                } else {
                    while (i < j && map.size() > 2) {
                        map.put(fruits[i],map.get(fruits[i])-1);
                        if(map.get(fruits[i]) == 0){
                            map.remove(fruits[i]);
                        }
                        i++;
                    }
                    
                }
            }
            if (map.size() <= 2) {
                if (j - i + 1 >= size) {
                    size = j - i + 1;
                }
            }
            j++;
        }
        return size;
    }
}