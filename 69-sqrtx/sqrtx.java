class Solution {
    public int mySqrt(int n) {
        
        int s=0;
        int e = n;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            long square = (long) mid * mid;

            if(square == n){
                return mid;
            }
            else if(square > n){
                e = mid-1; 
            }else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
}