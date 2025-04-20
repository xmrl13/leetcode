package vagas.reverseList;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.reverseList(new int[]{1, 2, 3, 4, 5})));
    }

    public int[] reverseList(int[] list) {

        var left = 0;
        var right = list.length - 1;

        while(left < right) {

            var temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }

        return list;
    }
}
