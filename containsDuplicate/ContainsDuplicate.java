package containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//Verifica se há duplicidade em uma lista qualquer
public class ContainsDuplicate {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 3, 5, 7, 8, 8);

        System.out.println(containsDuplicate(lista));

    }

    public static boolean containsDuplicate(List<Integer> nums) {
        var map = new HashSet<Integer>();
        for (int num : nums) {
            if (map.contains(num)) {
                return true;
            }
            map.add(num);
        }
        return false;
    }
}