class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int longest = 0;
        int right = 0;
        int left = 0;

        for(right=0;right<s.length();right++){

            char curr = s.charAt(right);
            
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(curr);
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
        
    }
}