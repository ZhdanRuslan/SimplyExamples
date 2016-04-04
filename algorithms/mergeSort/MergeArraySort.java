package algorithms.mergeSort;

import java.util.Arrays;

/**
 * Created by Ruslan Zhdan on 04.04.2016.
 */
public class MergeArraySort {

    public static void main(String[] args) {
        int[] arr = {321, 12, 56, 79, 81, 1, 36};
        System.out.println(Arrays.toString(mergeSort(arr, 0 , arr.length-1)));
    }

    static int[] merge(int a[], int startPosA, int endPosA, int b[], int startPosB, int endPosB) {
        int firstPart = endPosA - startPosA + 1;
        int secondPart = endPosB - startPosB + 1;

        int[] c = new int[firstPart + secondPart];

        int ai = 0;
        int bi = 0;

        for (int i = 0; i < c.length; i++) {
            if (ai >= firstPart) {
                c[i] = b[bi++];
                continue;
            }
            if (bi >= secondPart) {
                c[i] = a[ai++];
                continue;
            }
            if (a[ai] < b[bi]) {
                c[i] = a[ai++];
            } else {
                c[i] = b[bi++];
            }
        }
        return c;
    }

    static int[] mergeSort(int[] a, int start, int end) {

        int length = end - start + 1;

        if (length == 1) {
            return new int[]{a[start]};
        }

        if (length == 2) {
            if (a[start] < a[end]) {
                return new int[]{a[start], a[end]};
            }
            {
                return new int[]{a[end], a[start]};
            }
        }

        int half = length / 2;

        int[] b = mergeSort(a, start, start + half - 1);
        int[] c = mergeSort(a, start + half, end);

        return merge(b, 0, b.length - 1, c, 0, c.length - 1);
    }
}