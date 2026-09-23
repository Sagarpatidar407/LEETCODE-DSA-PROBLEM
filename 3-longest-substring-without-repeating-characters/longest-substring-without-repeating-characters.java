class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longest = 0;

        for(int i=0;i<s.length();i++){

            HashSet<Character> set = new HashSet<>();

            for(int j=i;j<s.length();j++){
                char curr = s.charAt(j);
                if(set.contains(curr)){
                    break;
                }
                set.add(curr);
                longest = Math.max(longest, j-i+1);
            }


        }

        return longest;
        
    }
}