class Solution {

    public void merge(int[] arr, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        int k = left;

        for(int i=0;i<n1;i++){
            leftarr[i] = arr[k++];
        }

        k = mid+1;

        for(int i=0;i<n2;i++){
            rightarr[i] = arr[k++];
        }

        int leftindex = 0, rightindex = 0, mainindex = left;

        while(leftindex < n1 && rightindex < n2){

            if(leftarr[leftindex] < rightarr[rightindex]){
                arr[mainindex++] = leftarr[leftindex++];
            }else{
                arr[mainindex++] = rightarr[rightindex++];
            }

        }

        while(leftindex < n1){
            arr[mainindex++] = leftarr[leftindex++];
        }

        while(rightindex < n2){
            arr[mainindex++] = rightarr[rightindex++];
        }




    }


    public void mergesort(int[] nums, int s, int e){

        if(s<e){
            int mid = s + (e-s)/2;

            mergesort(nums, s, mid);
            mergesort(nums, mid+1, e);

            merge(nums, s, mid, e);

        }

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j=0;
        for(int i=m;i<n+m;i++){
            nums1[i] = nums2[j++];
        }

        mergesort(nums1, 0, n+m-1);
    }
}