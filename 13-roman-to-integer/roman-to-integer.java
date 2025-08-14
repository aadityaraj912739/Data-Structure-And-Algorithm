class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Stack<Character>stack = new Stack();
        int i = 0;
        int n = s.length();
        int j = n-1;
        int sum = 0;
        while(j >= 0){
            char ch = s.charAt(j);
            if(stack.isEmpty()){
                sum = sum + map.get(ch);
            }else{
                if(map.get(ch) < map.get(stack.peek())){
                    int val = -1*map.get(ch);
                    sum = sum+val;
                }else{
                    sum = sum + map.get(ch);
                }
            }
            stack.push(ch);
            j--;
        }
        return sum;
    }
}