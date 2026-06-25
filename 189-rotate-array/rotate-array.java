class Solution {

    public void rot(int [] nums, int s, int e){
        
        while(e>s){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }

    }

    public void rotate(int[] nums, int k) {


        int n = nums.length;
        k = k % n;
        if(n <= 1) return;
            rot(nums, 0, n-1);
            rot(nums, 0, k-1);
            rot(nums, k, n-1);
        

    }
}