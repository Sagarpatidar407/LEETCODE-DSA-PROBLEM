class Solution {

    public boolean comparefreq(int[] count1, int[] count2){

        for(int i=0;i<26;i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] count1 = new int[26];

        for(int i=0;i<s1.length();i++){
            int ch = s1.charAt(i);
            count1[ch - 'a']++;
        }

        int i=0;
        int windowlength = s1.length();
        int[] count2 = new int[26];
        for(i=0;i<windowlength;i++){
            int ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        if(comparefreq(count1, count2) == true) return true;
        else{

            while(i < s2.length()){

                char newChar = s2.charAt(i);
                count2[newChar - 'a']++;

                int oldcharIndex = i - windowlength;
                char oldChar = s2.charAt(oldcharIndex);
                count2[oldChar - 'a']--;

                if(comparefreq(count1, count2) == true) return true;

                i++;

            }

        }
        return false;

        }

    }