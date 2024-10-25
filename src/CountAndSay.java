public class CountAndSay {

    public static String countAndSay(int n) {
        if(n == 1) return "1";
        int i = 0;
        StringBuilder result = new StringBuilder();
        String current = "1";
        while (i < n-1) {
            current = compress(current);
            System.out.println(current);
            i++;
        }
        return current;
    }

    public static String compress(String input) {
        int i = 0;
        int j = 1;
        int count = 1;
        StringBuilder result = new StringBuilder();
        while (j < input.length()) {

            if (input.charAt(i) == input.charAt(j)) {
                count = count + 1;
            }else{
                result.append(count);
                result.append(input.charAt(i));
                count =1;
            }
            i++;
            j++;
        }
        result.append(count);
        result.append(input.charAt(i));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(10));
    }
}
