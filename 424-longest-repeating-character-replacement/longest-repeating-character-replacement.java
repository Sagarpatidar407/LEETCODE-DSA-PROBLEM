class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int ans = 0;
        int max_freq = 0;

        for(int right = 0;right < s.length();right++){

            char curr = s.charAt(right);
            freq[curr - 'A']++;

            max_freq = Math.max(max_freq, freq[curr - 'A']);

            while((right - left + 1) - max_freq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
        
    }
}