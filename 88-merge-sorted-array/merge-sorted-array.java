class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0;
        int j=0;
        List<Integer> arr = new ArrayList<>();

        while(i<m && j<n){
            // while(nums1[i] == 0) i++; 
            // while(nums2[j] == 0) j++;

            if(nums1[i] <= nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }

        }

        while(i<m){
            arr.add(nums1[i]);
            i++;
        }
        while(j<n){
            arr.add(nums2[j]);
            j++;
        }

        for(int k=0;k<arr.size();k++){
            nums1[k] = arr.get(k);
        }

    }
}