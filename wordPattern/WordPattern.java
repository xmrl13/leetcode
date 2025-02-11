package wordPattern;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));

    }

    public static boolean wordPattern(String pattern, String s) {

        var sToStringList = s.split(" ");
        var patternToCharArray = pattern.toCharArray();
        var map = new HashMap<Character, String>();

        if(patternToCharArray.length != sToStringList.length) {
            return false;
        }

        for (int i = 0; i < sToStringList.length; i++) {

            if (!map.containsKey(patternToCharArray[i])) {
                if (!map.containsValue(sToStringList[i])) {
                    map.put(patternToCharArray[i], sToStringList[i]);
                } else {
                    return false;
                }
            } else if (map.containsKey(patternToCharArray[i]) && !map.get(patternToCharArray[i]).equals(sToStringList[i])) {
                return false;
            }
        }
        return true;
    }
}
