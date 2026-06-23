class Solution {
    public int thirdMax(int[] nums) {
        
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num:nums){
            if(first == num || sec == num || third == num){
                continue;
            }

            if(num > first){
                third = sec;
                sec = first;
                first = num;
            }else if(num > sec){
                third = sec;
                sec = num;
            }else if(num > third){
                third = num;
            }
        }

        return third == Long.MIN_VALUE?(int)first: (int)third;

    }
}