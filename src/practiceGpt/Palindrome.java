package practiceGpt;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";
        boolean ifStrIsPalindrome = isPalindrome(str);

        System.out.println(ifStrIsPalindrome);

    }

    private static boolean isPalindrome(String str) {

        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {

            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
