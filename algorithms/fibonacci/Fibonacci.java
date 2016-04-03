package algorithms.fibonacci;

import java.util.Arrays;

/**
 * Created by Ruslan Zhdan on 03.04.2016.
 */
public class Fibonacci {
    public static long fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        long[] result = new long[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = fibonacci(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
