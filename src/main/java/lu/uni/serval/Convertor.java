package lu.uni.serval;

import java.util.Map;

public class Convertor {
    public static int romanToInt(String roman) {
        int sum = 0, prevInt = 0;
        char prevChar = ' ';
        Map dict = Map.of('I',1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        roman = roman.toUpperCase();
        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            if (dict.containsKey(prevChar)) {
                prevInt = (int)dict.get(prevChar);
            }
            if(!dict.containsKey(currentChar)) {
               return -1;
            }
            int currentInt = (int)dict.get(currentChar);
            if (currentInt >= prevInt) {
                sum += currentInt;
            } else {
                sum -= currentInt;
            }
            prevChar = currentChar;
        }
        return sum;
    }
}
