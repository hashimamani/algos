

public class Main {
    public static void loop(int x) {
        // [1,2,3,5,6] // 0(n) insertion
        // [1,2,3,4,5,6]
        // [1,2,3,4,5,6]
        // [1->2->3->4->5->6->7]
        // 0 (1)         // single variable
        // 0 (n)         // array, stack, queue, linked list, hashmap
        // 0 (log n) // binary search
        // 0 n(log n) // merge sort
        // 0 (n^2) // bubble sort // matrix // multi dimension array
        // 0 (n^n) // exponential // travelsalesman // worst

        // when to stop
        if (x > 10) {
            return;
        }

        // our logic
        System.out.println(x);

        // repetition by calling yourself
        loop(x + 1);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        if (arr.length == 1) {
            return max;
        }
       return recursiveMax(arr, 0, max);
    }

    public static int recursiveMax(int[] arr, int index, int max) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return recursiveMax(arr, index + 1, max);
    }

    public static void main(String[] args) {

        System.out.println(max(new int[]{1, 2, 3, 4, 5,6,99,12,3,4,5,33,444,332}));

    }
}