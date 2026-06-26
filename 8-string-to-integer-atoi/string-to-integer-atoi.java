class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        long num = 0;

        // skip spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // sign check
        if (i < s.length() &&
           (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // read digits
        while (i < s.length() &&
               Character.isDigit(s.charAt(i))) {

            num = num * 10 + (s.charAt(i) - '0');

            // overflow check
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * num);
    }
}