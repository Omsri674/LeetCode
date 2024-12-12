class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> piles = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : gifts)
            piles.add(val);

        for (int i = 0; i < k && piles.peek() > 1; i++) {
            int x = piles.poll();
            piles.add((int) Math.sqrt(x));
        }

        long sum = 0;
        for (int val : piles)
            sum += val;

        return sum;
    }
}