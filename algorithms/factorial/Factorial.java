package algorithms.factorial;

/**
 * Created by Ruslan Zhdan on 03.04.2016.
 */
public class Factorial {
    public static long factorial(long num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        if (num > 1)
            return factorial(num - 1) * num;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
    }
}
