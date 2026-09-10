class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int one = 0; one < n - 3; one++) {

            if (one > 0 && nums[one] == nums[one - 1])
                continue;

            for (int two = one + 1; two < n - 2; two++) {

                if (two > one + 1 && nums[two] == nums[two - 1])
                    continue;

                int l = two + 1;
                int r = n - 1;

                while (l < r) {

                    long sum = (long) nums[one] + nums[two]
                             + nums[l] + nums[r];

                    if (sum == target) {

                        res.add(Arrays.asList(
                            nums[one],
                            nums[two],
                            nums[l],
                            nums[r]
                        ));

                        l++;
                        r--;

                        while (l < r && nums[l] == nums[l - 1])
                            l++;

                        while (l < r && nums[r] == nums[r + 1])
                            r--;
                    }

                    else if (sum < target) {
                        l++;
                    }

                    else {
                        r--;
                    }
                }
            }
        }

        return res;
    }
}