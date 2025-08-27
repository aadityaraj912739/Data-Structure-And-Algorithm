class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        int n = sandwiches.length; 
        int i = n - 1;
        while (i >= 0) {             
            stack.push(sandwiches[i]);  
            i--;
        }

        int j = 0;
        int m = students.length;    
        while (j < m) {
            q.add(students[j]);
            j++;
        }

        int index = q.size(); 
        int eat = 0;

        while (index != 0 && !stack.isEmpty() && !q.isEmpty()) {
            if (q.peek().equals(stack.peek())) {  
                eat++;
                stack.pop();
                q.poll();
                index = q.size();  
            } else {
                int val = q.poll();
                q.add(val);
                index--;  
            }
        }

        int ans = q.size();  
        return ans;
    }
}
