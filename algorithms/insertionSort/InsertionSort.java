package algorithms.insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sourceArray = {1, 12, 99, 54, 42, 11, 7, 89, 36, 54, 312, 8};
        int[] result = insertionSort(sourceArray);
        for (int tmp : result)
            System.out.print(tmp+" ");
    }

    public static int[] insertionSort(int[] num) {
        int j; // the number of items sorted so far
        int key; // the item to be inserted
        int i;

        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            key = num[j];
            for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values are moving up
            {
                num[i + 1] = num[i];
            }
            num[i + 1] = key; // Put the key in its proper location
        }
        return num;
    }
}
