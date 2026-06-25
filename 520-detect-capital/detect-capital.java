class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercount = 0;
        int lowercount = 0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                uppercount++;
            }else{
                lowercount++;
            }
        }

        if(Character.isUpperCase(word.charAt(0))){
            if(uppercount == word.length()) return true;
            else if(uppercount == 1) return true;
            else return false;
        }
        return lowercount == word.length();

    }
}