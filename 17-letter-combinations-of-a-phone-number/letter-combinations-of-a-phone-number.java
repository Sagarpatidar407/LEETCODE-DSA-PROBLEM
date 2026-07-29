class Solution {

    public void solve(String digits, int index, String[] mapping, StringBuilder output, List<String> ans){

        if(index >= digits.length()){
            ans.add(output.toString());
            return;
        }

        int value = digits.charAt(index) - '0';
        String mapString = mapping[value];

        for(int i=0;i<mapString.length();i++){

            output.append(mapString.charAt(i));
            solve(digits, index+1, mapping, output, ans);
            output.deleteCharAt(output.length()-1);
        }

    }

    public List<String> letterCombinations(String digits) {
        
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        int index = 0;
        StringBuilder output = new StringBuilder();

        solve(digits, index, mapping, output, ans);
        return ans;

    }
}