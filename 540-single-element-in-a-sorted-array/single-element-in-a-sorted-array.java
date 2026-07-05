class Solution {
    public int singleNonDuplicate(int[] nums) {

        int s = 0;
        int e = nums.length;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(s == e) return nums[s];

            int currentvalue = nums[mid];

            int prevalue = -1;
            if(mid-1 >= 0){
                prevalue = nums[mid-1];
            }

            int nextvalue = -1;
            if(mid+1 < nums.length){
                nextvalue = nums[mid+1];
            }

            if(currentvalue != prevalue && currentvalue != nextvalue){
                return currentvalue;
            }

            if(currentvalue == prevalue && currentvalue != nextvalue){

                int endingIndexOfPair = mid;

                if((endingIndexOfPair & 1) == 1){
                    s = mid+1;
                }else{
                    e = mid-1;
                }

            }
            if(currentvalue != prevalue && currentvalue == nextvalue){

                int startingIndexOfPair = mid;

                if((startingIndexOfPair & 1) == 1){
                    e = mid-1;
                }else{
                    s = mid+1;
                }

            }


        }

        return -1;

    }
}