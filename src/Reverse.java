public class Reverse {
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        boolean isNegative = x < 0;
        x = Math.abs(x);
        StringBuilder builder = new StringBuilder();
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            builder.append(rem);
            System.out.println(x);
        }
        int res = Integer.parseInt(builder.toString());
        return isNegative ? -res : res;
    }

    public static void main(String[] args) {
        int x = 3 / 10;
        System.out.println(reverse(1534236469));
    }
}
