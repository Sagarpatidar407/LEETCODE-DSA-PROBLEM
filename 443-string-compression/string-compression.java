class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;

        while(readIndex < chars.length){

            char currChar = chars[readIndex];
            int count=0;

            while(readIndex<chars.length && chars[readIndex] == currChar){
                readIndex++;
                count++;
            }

            chars[writeIndex] = currChar;
            writeIndex++;

            if(count > 1){
                String countstr = String.valueOf(count);
                for(char digit: countstr.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }

        }
        return writeIndex;

    }
}