package easy.firstOccurrenceInString28;

class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // 0
        System.out.println(solution.strStr("sadbutsad", "sad"));

        // -1
        System.out.println(solution.strStr("leetcode", "leeto"));

    }

    public int strStr(String haystack, String needle) {

        var sizeNeedle = needle.length();
        var sizeHaystack = haystack.length();
        var index = 0;
        var controle = -1;

        for (int i = 0; i < sizeHaystack; i++) {

            if (haystack.charAt(i) == needle.charAt(index)) {

                if (index == 0) {
                    controle = i;
                }

                index++;

                if (index == sizeNeedle) {
                    return controle;
                }

            } else {
                if (index > 0) {
                    i = controle;
                }
                index = 0;
                controle = -1;
            }
        }
        return -1;
    }
}