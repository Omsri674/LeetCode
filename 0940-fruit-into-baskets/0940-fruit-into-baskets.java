class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> basket = new HashMap();
        int start = 0,end=0;
        int n= fruits.length, maxLen = 0;

        while(end < n){
            basket.put(fruits[end],basket.getOrDefault(fruits[end],0)+1);

            if(basket.size() >= 3){
                basket.put(fruits[start],basket.get(fruits[start])-1);
                if(basket.get(fruits[start])== 0) basket.remove(fruits[start]);
                start++;
            }

            int curLen = end - start+1;
            maxLen = Math.max(curLen,maxLen);
            end++;
            
        }
        return maxLen;
        
    }
}