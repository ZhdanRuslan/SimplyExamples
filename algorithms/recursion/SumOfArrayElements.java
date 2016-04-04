package algorithms.recursion;

/**
 * Created by Ruslan Zhdan on 04.04.2016.
 */
public class SumOfArrayElements {

    public static void main(String[] args) {
        int[] src = {1, 0, 0, 0, 58, 65, 3};
        System.out.println(sum(src, 0));
    }

    static int sum(int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }
        if (array[index] > 0) {
            return array[index] + sum(array, index + 1);
        } else {
            return sum(array, index + 1);
        }
    }
}

