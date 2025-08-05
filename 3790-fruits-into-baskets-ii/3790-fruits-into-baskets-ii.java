class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        int res= 0;
        boolean[] visited = new boolean[n];
        

       for(int f : fruits){
        boolean flag = false;
        
        for(int i=0;i<n;i++){
            if(f <= baskets[i]){
                baskets[i] = 0;
                flag = true;
                break;
            }
            
        }
        if(!flag){
            res++;
            }


       }
        return res;
    }
}