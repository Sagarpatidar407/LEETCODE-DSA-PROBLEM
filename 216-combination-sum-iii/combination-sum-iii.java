class Solution {

    public void solve(int[] cand, int target, int i, List<List<Integer>> ans, List<Integer> output, int count, int k){

        if(count > k) return;

        if(count == k &&target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(i >= cand.length) return;
        if(target < 0) return;

        output.add(cand[i]);

        solve(cand, target - cand[i], i+1, ans, output, count+1, k);
        output.remove(output.size()-1);

        while(i < cand.length-1 && cand[i] == cand[i+1]){
            i++;
        }

        solve(cand, target, i+1, ans, output,count,k);


    }


    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int [] candidates = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        int index = 0;
        solve(candidates, n, index, ans, output, count, k);
        return ans;

    }
}