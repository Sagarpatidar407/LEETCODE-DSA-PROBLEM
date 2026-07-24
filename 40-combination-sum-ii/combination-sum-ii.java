class Solution {

    public void solve(int[] cand, int target, int i, List<List<Integer>> ans, List<Integer> output){

        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(i >= cand.length) return;
        if(target < 0) return;

        output.add(cand[i]);

        solve(cand, target - cand[i], i+1, ans, output);
        output.remove(output.size()-1);

        while(i < cand.length-1 && cand[i] == cand[i+1]){
            i++;
        }

        solve(cand, target, i+1, ans, output);


    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(candidates, target, index, ans, output);
        return ans;

    }
}