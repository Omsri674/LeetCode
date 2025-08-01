class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals = new ArrayList();
        List<Integer> first = new ArrayList();
        first.add(1);
        pascals.add(first);

        for(int i=1;i<numRows;i++){
           List<Integer> prev = pascals.get(i-1);
           List<Integer> current = new ArrayList();
           current.add(1);
           for(int j=1;j<i;j++){
            int sum = prev.get(j - 1) + prev.get(j);
            current.add(sum);
           }
           current.add(1);
           pascals.add(current);
        }
        return pascals;
    }
}



