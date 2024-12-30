package Leetcode;

public class RomantoInteger {
        public int romanToInt(String s) {
            int ans = 0;
            int prev = 0;
            //reverse iteration
            for (int i = s.length() - 1; i>=0;i--) {
                int currentValue = getValue(s.charAt(i));
                if (currentValue >= prev) {
                    ans += currentValue;
                } else {
                    ans -= currentValue;
                }
                prev = currentValue; //store the curr to prev for next iteration
            }
            return ans;
        }

        public int getValue(char c) {
            switch (c) {
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
}
