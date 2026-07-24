class Solution {

    public void solve(int[] cand, int target, int i, List<List<Integer>> ans, List<Integer> output){

        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(i >= cand.length) return;
        if(target < 0) return;

        output.add(cand[i]);

        solve(cand, target-cand[i], i, ans, output);
        output.remove(output.size()-1);
        solve(cand, target, i+1, ans, output);


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(candidates, target, index, ans, output);
        return ans;

    }
}