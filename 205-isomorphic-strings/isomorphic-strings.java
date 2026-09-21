class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char curr1 = s.charAt(i);
            char curr2 = t.charAt(i);

            if(map1.containsKey(curr1) && map1.get(curr1) != curr2) return false;
            if(map2.containsKey(curr2) && map2.get(curr2) != curr1) return false;

            map1.put(curr1, curr2);
            map2.put(curr2, curr1);

        }

        return true;

    }
}