import java.util.HashMap;

class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        int j = 0;
        int count = 0;
        int freq = 0;

        while (j < n) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // If window size exceeds 3, shrink from left
            if (j - i + 1 > 3) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                i++;
            }

            // Check window of size 3
            if (j - i + 1 == 3 && map.size() == 3) {
                freq++;
            }

            j++;
        }
        return freq;
    }
}
