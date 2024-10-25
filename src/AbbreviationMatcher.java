public class AbbreviationMatcher {
    public static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (Character.isDigit(abbr.charAt(j))) {
                if (abbr.charAt(j) == '0') return false; // no leading zeros
                int start = j;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    j++;
                }
                int num = Integer.parseInt(abbr.substring(start, j));
                i += num;
            } else {
                if (word.charAt(i) != abbr.charAt(j)) return false;
                i++;
                j++;
            }
        }
        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args) {
        AbbreviationMatcher matcher = new AbbreviationMatcher();
        // Example 1
        System.out.println(matcher.validWordAbbreviation("internationalization", "i12iz4n")); // true
        // Example 2
        System.out.println(matcher.validWordAbbreviation("apple", "a2e")); // false
    }
}
