package algorithms.coctailSort;

public class CocktailSort {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 8, 1, 0, 6, 4, 6, 7};
        int left = 0; // left side
        int right = array.length - 1; // right side

        do {
            //Shift to end "heavy elements"
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--; // decrement right border
            //Shift to begin "light elements"
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++; // increment left border
        } while (left <= right);

        for (int i : array) System.out.print(i + " "); // Print an array
    }
}