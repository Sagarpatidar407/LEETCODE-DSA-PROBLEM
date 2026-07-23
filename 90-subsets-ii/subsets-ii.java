class Solution {

    public void solve(int[] nums, List<List<Integer>> ans, List<Integer> output, int i){

        if(i >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        output.add(nums[i]);
        solve(nums, ans, output, i+1);

        output.remove(output.size()-1);

        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }

        solve(nums, ans, output, i+1);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, ans, output, index);
        return ans;

    }
}