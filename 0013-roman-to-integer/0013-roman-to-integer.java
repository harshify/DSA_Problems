class Solution {
    public int romanToInt(String s) {
        final char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (i != chars.length - 1 &&
               (c == 'I' ||
                c == 'X' ||
                c == 'C') &&
                c != chars[i + 1] &&
                canSubtractAFromB(c, chars[i + 1])) {
                    sum += getNumberFromRoman(chars[i + 1]) - getNumberFromRoman(c);
                    i++;
            } else {
                sum += getNumberFromRoman(c);
            }
        }
        return sum;
    }

    private boolean canSubtractAFromB(char a, char b) {
        if (a == 'I') {
            return b == 'V' || b == 'X';
        } else if (a == 'X') {
            return b == 'L' || b == 'C';
        } else if (a == 'C') {
            return b == 'D' || b == 'M';
        }
        return false;
    }

    private int getNumberFromRoman(char roman) {
        switch(roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}