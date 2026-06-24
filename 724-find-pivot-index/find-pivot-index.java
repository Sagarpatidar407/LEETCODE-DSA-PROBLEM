class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;

        for(int i=0;i<n;i++){
            int leftsum = 0;
            int rightsum = 0;

            for(int r=0;r<i;r++){
                leftsum+=nums[r];
            }

            for(int l=i+1;l<n;l++){
                rightsum+=nums[l];
            }

            if(leftsum == rightsum){
                return i;
            }

        }

        return -1;

    }
}