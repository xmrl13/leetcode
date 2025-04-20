package medium.addTwoNumbers2;

import java.math.BigInteger;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder l1String = new StringBuilder();
        StringBuilder l2String = new StringBuilder();

        do {

            if (l1 != null) {
                l1String.append(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                l2String.append(l2.val);
                l2 = l2.next;
            }

        } while (l1 != null || l2 != null);

        l1String.reverse();
        l2String.reverse();

        java.math.BigInteger l1Num = new java.math.BigInteger(l1String.toString());
        java.math.BigInteger l2Num = new java.math.BigInteger(l2String.toString());


        java.math.BigInteger numFinal = l1Num.add(l2Num);


        ListNode fake = new ListNode();
        ListNode listNode = fake;

        fake.next = listNode;

        if (numFinal.equals(java.math.BigInteger.ZERO)) {
            return new ListNode(0);
        }

        while (numFinal.compareTo(java.math.BigInteger.ZERO) > 0) {

            int digit = numFinal.mod(java.math.BigInteger.TEN).intValue();
            numFinal = numFinal.divide(java.math.BigInteger.TEN);

            listNode.next = new ListNode(digit);
            listNode = listNode.next;
        }

        return fake.next;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        // Exemplo 1: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1_example1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2_example1 = new ListNode(5, new ListNode(6, new ListNode(4)));
        solution.addTwoNumbers(l1_example1, l2_example1);

        // Exemplo 3: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        ListNode l1_example3 = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2_example3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
    }

}

