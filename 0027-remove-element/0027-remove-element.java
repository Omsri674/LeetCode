class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int e: nums){
            if(e != val){
                k++;
            }
        }
        int l=0, r = nums.length-1;
        ArrayList<Integer> expectedNums = new ArrayList();
        while(l<r){
            if(nums[l] == val && nums[r] != val){
                expectedNums.add(nums[r]);
                swap(l,r,nums);
            }else if(nums[l] == val && nums[r] == val){
                r--;

            }else if(nums[l] != val && nums[r] != val){
                
                l++;
            }
            else{
                r--;
                l++;
            }
        }
        return k;
    }

    void swap(int l, int r,int[] nums){
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
}