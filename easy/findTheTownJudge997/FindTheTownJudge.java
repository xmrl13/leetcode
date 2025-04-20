package easy.findTheTownJudge997;

public class FindTheTownJudge {

    public static void main(String[] args) {

        FindTheTownJudge findTheTownJudge = new FindTheTownJudge();

        // 2
        System.out.println(findTheTownJudge.findJudge(2, new int[][]{{1, 2}}));
        // 3
        System.out.println(findTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        // -1
        System.out.println(findTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
        // -1
        System.out.println(findTheTownJudge.findJudge(3, new int[][]{{1, 2}, {2, 3}}));
    }

    public int findJudge(int n, int[][] trust) {

        int[] count = new int[n + 1];

        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
