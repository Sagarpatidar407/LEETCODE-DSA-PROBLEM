class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            int sub = target - nums[i];

            if(map.containsKey(sub)){
                result[1] = i;
                result[0] = map.get(sub);
            } 
            map.put(nums[i],i);
        }

        return result;

    }
}