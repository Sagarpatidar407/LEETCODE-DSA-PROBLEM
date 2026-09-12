class Solution {
    public int maxProduct(int[] nums) {

        int res = nums[0];
        int min = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            int curr = nums[i];

            if(curr < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            min = Math.min(curr, min*curr);
            max = Math.max(curr, max*curr);

            res = Math.max(res, max);

        }

        return res;
        
    }
}