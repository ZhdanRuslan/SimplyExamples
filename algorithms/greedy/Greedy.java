package algorithms.greedy;

/**
 * Created by Ruslan Zhdan on 06.03.2016.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
* This code having this output (it is output for
* 10,20,50,100,200 bank notes, you have 10 of each
* of them and you want to get 180 in sum)
* */
public class Greedy {
    int[] values = {10,20,50,100,200};

    public static void main(String[] args) {
        int[] values = {10,20,50,100,200};
        int[] ammounts = {10,10,10,10,10};
        List<Integer[]> results = solutions(values, ammounts, new int[5], 180, 0);
        for (Integer[] result : results){
            System.out.println(Arrays.toString(result));
        }

    }

    public static List<Integer[]> solutions(int[] values, int[] ammounts, int[] variation, int price, int position){
        List<Integer[]> list = new ArrayList<>();
        int value = compute(values, variation);
        if (value < price){
            for (int i = position; i < values.length; i++) {
                if (ammounts[i] > variation[i]){
                    int[] newvariation = variation.clone();
                    newvariation[i]++;
                    List<Integer[]> newList = solutions(values, ammounts, newvariation, price, i);
                    if (newList != null){
                        list.addAll(newList);
                    }
                }
            }
        } else if (value == price) {
            list.add(myCopy(variation));
        }
        return list;
    }

    public static int compute(int[] values, int[] variation){
        int ret = 0;
        for (int i = 0; i < variation.length; i++) {
            ret += values[i] * variation[i];
        }
        return ret;
    }

    public static Integer[] myCopy(int[] arr){
        Integer[] ret = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
}