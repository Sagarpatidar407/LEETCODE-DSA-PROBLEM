class Solution {

    public void solve(int[] nums, List<List<Integer>> ans, List<Integer> output, int i){

        if(i >= nums.length){

            ans.add(new ArrayList<>(output));
            return;

        }

        int curr = nums[i];
        output.add(curr);

        solve(nums, ans, output, i+1);
        output.remove(output.size()-1);
        solve(nums, ans, output, i+1);

    }

    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(nums, ans, output, index);
        return ans;

    }
}