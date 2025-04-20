package vagas.flipsToPwd;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 3
        System.out.println(solution.flips("1110011000"));
    }

    public int flips(String pwd) {

        var flips = 0;

        for (int i = 0; i < pwd.length(); i += 2){
            var a = pwd.charAt(i);
            var b = pwd.charAt(i+1);

            if (a != b){
                flips++;
            }
        }

        return flips;
    }
}
