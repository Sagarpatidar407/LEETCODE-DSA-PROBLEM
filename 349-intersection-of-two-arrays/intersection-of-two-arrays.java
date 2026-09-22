class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num: nums1){
            set1.add(num);
        }

        for(int num: nums2){
            if(set1.contains(num)){
                list.add(num);
                set1.remove(num);
            }
        }

        int[] arr = new int[list.size()];

        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }

        return arr;
        
    }
}