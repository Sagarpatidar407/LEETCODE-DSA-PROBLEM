class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        int prefixsum = 0;
        int count = 0;

        for(int num: nums){

            prefixsum += num;
            int req = prefixsum - k;

            if(map.containsKey(req)){
                count += map.get(req);
            }

            map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);
        }
        return count;
        
    }
}