package leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        char[] numArray = numStr.toCharArray();
        int numArrayLen = numArray.length;
        char[] palArray = new char[numArrayLen];

        for (int i = numArrayLen - 1; i >= 0; i--) {
            palArray[(numArrayLen -1) - i] = numArray[i];
        }
        System.out.println(String.valueOf(numArray));
        System.out.println(String.valueOf(palArray));

        return String.valueOf(numArray).equals(String.valueOf(palArray));
    }
}
