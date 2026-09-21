import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char curr = pattern.charAt(i);
            String word = words[i];

            // character -> word
            if (map1.containsKey(curr) &&
                !map1.get(curr).equals(word)) {
                return false;
            }

            // word -> character
            if (map2.containsKey(word) &&
                map2.get(word) != curr) {
                return false;
            }

            map1.put(curr, word);
            map2.put(word, curr);
        }

        return true;
    }
}