package lu.uni.serval;

import java.util.HashMap;

public class Convertor {
    private static final HashMap<Character, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
    }

    public static int romanToInt(String roman) {
        int sum = 0,  prevInt = 0;

        roman = roman.toUpperCase();
        char prevChar = ' ';

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);

            if (dictionary.containsKey(prevChar)) {
                prevInt = dictionary.get(prevChar);
            }

            if(!dictionary.containsKey(currentChar)) {
                return -1;
            }

            int currentNum = dictionary.get(currentChar);
            if (currentNum >= prevInt) {
                sum += currentNum;
            } else {
                sum -= currentNum;
            }

            prevChar = currentChar;
        }

        return sum;
    }
}
