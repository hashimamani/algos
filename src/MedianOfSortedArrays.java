import java.io.FilterOutputStream;
import java.util.Arrays;

public class MedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            arr[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            arr[k++] = nums2[j++];
        }

        if (arr.length % 2 == 0) {
            return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }

        return arr[arr.length / 2];

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 5, 6, 7};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
//        System.out.println(Arrays.toString(findMedianSortedArrays(nums1, nums2)));
    }
}
