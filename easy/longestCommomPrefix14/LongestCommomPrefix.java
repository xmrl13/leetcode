package easy.longestCommomPrefix14;

import java.util.List;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = new int[]{1, 3, 4};
        int[] list2 = new int[]{1, 2, 4};
    }
    public void mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        for(Integer i : list1) {
            System.out.println(list2.get(i));
        }

    }
}