class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int mindiff = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            mindiff = Math.min(mindiff, arr[i] - arr[i-1]);
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i] - arr[i-1] == mindiff){
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }

        return list;


    }
}