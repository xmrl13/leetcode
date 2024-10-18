class Solution {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }


    public static boolean isPalindrome(int x) {

        Integer to = x;
        String converted = to.toString();
        char carac [] = converted.toCharArray();

        for(int i = 0; i < carac.length; i++){
            if(carac[i] == carac[carac.length-1-i]){
                System.out.println("Char at " + i + "equals char at " + (carac.length-1-i));
        } else{
            System.out.println("não");
            return false;

        }
    } return true;
}

class Solution {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        String converted = Integer.toString(x);
        char[] carac = converted.toCharArray();
        
        for (int i = 0; i < carac.length / 2; i++) {
            if (carac[i] != carac[carac.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

}

//A primeira solução é melhor, se vale de uma propriedade matemática
//A propriedade em questão é que em um sistema decimal
// O modulo 10 do numero * 10 resulta no ultimo numero
// 121 % 10 -> 0,1 * 10 -> 1, logo extraimos o ultimo numero
// Apos isso se dividirmos o numero original por 10 tenho 12
// Dessa forma é possivel verificar o palindromo sem realiza conversoes
