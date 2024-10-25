public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        String longestPalindrome = "";

        int i = 0;
        int j = 0;
        while (i < s.length()) {
            while (j < s.length()) {
                String palindrome = s.substring(i, j + 1);
                if (isPalindrome(palindrome) && palindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = palindrome;
                }
                j++;
            }
            i++;
            j = i;
        }

        return longestPalindrome;

    }

    private static boolean isPalindrome(String s) {

        int i = s.length() / 2 - 1;
        int j = s.length() / 2;
        if (s.length() % 2 != 0) {
            i = j = s.length() / 2;
        }

        while (i >= 0 && j < s.length()) {
            if (s.charAt(i--) != s.charAt(j++)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babxxxbaxabbba"));
    }
}
