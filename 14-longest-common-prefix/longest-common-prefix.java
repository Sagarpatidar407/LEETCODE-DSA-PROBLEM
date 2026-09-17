class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs, (a,b)-> a.length() - b.length());

        String firstword = strs[0];

        String result = "";
        boolean flag = true;

        for(int i=0;i<firstword.length();i++){

            char currChar = firstword.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) != currChar){
                    flag = false;
                    break;
                }
            }
            if(flag == false) break;
            result+=currChar;
        }
        return result;
    }
}