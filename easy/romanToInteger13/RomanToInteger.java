package easy.romanToInteger13;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("III");
        romanToInteger.romanToInt("LVIII");
        romanToInteger.romanToInt("MCMXCIV");
    }

    public int romanToInt(String s) {

        HashMap<Character, Integer> mapa = new HashMap<>();

        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < (s.length()-1) && mapa.get(s.charAt(i)) < mapa.get(s.charAt(i + 1))) {
                total += mapa.get(s.charAt(i+1)) - mapa.get(s.charAt(i));
                i++;
            }else {
                total += mapa.get(s.charAt(i));
            }
        }
        return total;
    }
}


