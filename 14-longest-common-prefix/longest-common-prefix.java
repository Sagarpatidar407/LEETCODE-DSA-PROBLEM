class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String first = strs[0];
        if(strs.length == 1) return first;
        for(int i=0;i<first.length();i++){

            char ch = first.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(i == strs[j].length()){
                    return first.substring(0,i);
                }

                if(ch != strs[j].charAt(i)){
                    return first.substring(0,i);
                }

            }

        }
        return first;
    }
}