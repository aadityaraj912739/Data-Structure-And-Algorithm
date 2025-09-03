class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> dq = new ArrayDeque<>();
        Arrays.sort(deck);
        int i = 0;
        int n = deck.length;
        int j = n-1;
        while(j >= 0){
            int val = deck[j];
            if(dq.isEmpty()){
                dq.addFirst(val);
            }else{
                int remove = dq.pollLast();
                dq.addFirst(remove);
                dq.addFirst(val);
            }
            j--;
        }
        int[] nums = new int[dq.size()];
        int k = 0;
        while(!dq.isEmpty()){
            int remove = dq.pollFirst();
            nums[k] = remove;
            k++;
        }
        return nums;
    }
}