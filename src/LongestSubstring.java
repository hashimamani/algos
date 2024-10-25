import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int final_max = 0;
        Map<Character, Integer> lookup = new HashMap<>();
        int i = 0;
        int j = 0;

        while (i < s.length() && j < s.length()) {
            if (!lookup.containsKey(s.charAt(j))) {
                lookup.put(s.charAt(j), 1);
                max++;
                j++;
            } else {
                lookup.clear();
                i++;
                j = i;
                final_max = Math.max(final_max, max);
                max = 0;
            }
            final_max = Math.max(final_max, max);
        }

        return final_max;
    }

    public static void main(String[] args) {
        String x = "abctxzsdybbxytzrca";
        System.out.println(lengthOfLongestSubstring(x));
    }
}
