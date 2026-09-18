class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        while(n!=1){

            if(set.contains(n)){
                return false;
            }

            set.add(n);

            n = sumofsquare(n);
            
        }

        return true;

    }

    public int sumofsquare(int n){
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            int mult = ld*ld;
            sum+=mult;
            n = n/10;
        }
        return sum;

    }


}