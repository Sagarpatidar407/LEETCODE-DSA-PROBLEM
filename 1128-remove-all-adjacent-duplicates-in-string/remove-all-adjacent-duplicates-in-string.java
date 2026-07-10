class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder ans = new StringBuilder();

        for(char ch:s.toCharArray()){
            int len = ans.length();

            if(len>0 && ans.charAt(len-1) == ch){
                ans.deleteCharAt(len-1);
            }else{
                ans.append(ch);
            }

        }

        return ans.toString();

    }
}