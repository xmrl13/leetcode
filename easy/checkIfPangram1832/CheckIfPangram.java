package easy.checkIfPangram1832;

import java.util.HashSet;

public class CheckIfPangram {

    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {

        if (sentence.length()<26){
            return false;
        }
        var set = new HashSet<Character>();

        var charList = sentence.toCharArray();

        for (char c : charList) {
            set.add(c);
        }
        return set.size() == 26;
    }
}
