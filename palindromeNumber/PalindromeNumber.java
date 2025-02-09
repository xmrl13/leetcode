package palindromeNumber;

class PalindromeNumber {

    public static void main(String[] args) {
        int umValor = 12344321;
        System.out.println(isPalindrome(umValor));
    }


    public static boolean isPalindrome(int x) {

        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int revertido = 0;

        while (x > revertido) {
            revertido = revertido * 10 + x % 10;
            x /= 10;
        }
        return x == revertido || x == revertido / 10;
    }

}