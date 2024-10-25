import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int i = 0;
        List<List<Character>> rows = new ArrayList<>();
        while (i < numRows) {
            List<Character> row = new ArrayList<>();
            rows.add(row);
            i++;
        }

        int j = 0;
        int index = 0;
        int d = 1;

        while (j < s.length()) {
            List<Character> row = rows.get(index);
            row.add(s.charAt(j));
            if (index == numRows - 1) {
                d = -1;
            } else if (index == 0) {
                d = 1;
            }
            index = index + d;
            j++;
        }

        StringBuilder sb = new StringBuilder();
        for (List<Character> row : rows) {
            for (Character c : row) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("hsmhai",3));
    }
}
