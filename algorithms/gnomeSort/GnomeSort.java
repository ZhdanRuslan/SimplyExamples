package algorithms.gnomeSort;

public class GnomeSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 12, 1, 4, 32, 103, 87, 53, 49};
        int[] result = gnomeSort(array);
        for (int i : result)
            System.out.print(i + " ");
    }

    /*
    * @param a array of integers which have to be sorting
    * */
    public static int[] gnomeSort(int[] a) {
        int i = 1;
        while (i < a.length) {
            if (i == 0 || a[i - 1] <= a[i])
                i++;
            else {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
                i--;
            }
        }
        return a;
    }
}
