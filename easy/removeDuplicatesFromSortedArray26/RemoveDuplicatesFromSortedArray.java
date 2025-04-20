package easy.removeDuplicatesFromSortedArray26;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        // 2
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
        // 5
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));

    }

    public int removeDuplicates(int[] nums) {

        int unicos = 1;
        int atual;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                atual = nums[i];
                nums[unicos] = atual;
                unicos++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return unicos;
    }
}
/*
        for (int valor : nums) {
atual = valor;
            if (!mapa.contains(valor)) {
        mapa.add(valor);
nums[index] = valor;
index++;
unicos++;
        }
        }
*/