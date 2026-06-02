class Solution {

    public int pivort(int[] arr){

        int n = arr.length;
        int s = 0;
        int e = n-1;

        while(e > s){
            int mid = s + (e-s)/2;

            // line 1
            if(arr[0] <= arr[mid]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }

        return s;

    }

    public int binarySearch(int[] arr, int s, int e, int target){
        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }

        }
        return -1;
    }

    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int p = pivort(nums);
        int s = 0;
        int e = n-1;

        int ans = -1;

        if (nums[0] <= nums[n - 1]) {
            return binarySearch(nums, 0, n - 1, target);
        }

        if(target >= nums[p] && target <= nums[n-1]){
            ans = binarySearch(nums, p, n-1, target);    
        }
        else{
            ans = binarySearch(nums, s, p-1, target);    
        }

        return ans;

    }
}