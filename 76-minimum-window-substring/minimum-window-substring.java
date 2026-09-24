class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        int[] window = new int[128];

        // Count characters required from t
        for (char ch : t.toCharArray()) {
            need[ch]++;
        }

        int left = 0;
        int right = 0;

        int formed = 0;
        int required = 0;

        // Number of different characters required
        for (int i = 0; i < 128; i++) {
            if (need[i] > 0) {
                required++;
            }
        }

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);
            window[ch]++;

            // Character requirement is satisfied
            if (need[ch] > 0 && window[ch] == need[ch]) {
                formed++;
            }

            // Try to shrink the window
            while (formed == required) {

                // Update answer
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                // Window became invalid
                if (need[leftChar] > 0 &&
                    window[leftChar] < need[leftChar]) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}