class Solution {

    public void rotateArray(int[] nums, int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k%n;

        rotateArray(nums, 0, n-1);
        rotateArray(nums, 0, k-1);
        rotateArray(nums, k, n-1);
    }
}