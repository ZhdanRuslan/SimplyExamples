package algorithms.bubbleSort;

/*
* Java Bubble Sort Example
* This Java bubble sort example shows how to sort an array of int using bubble
* sort algorithm. Bubble sort is the simplest sorting algorithm.
* */

public class BubbleSort {

    public static void main(String[] args) {

        int intArray[] = new int[]{5, 90, 35, 45, 150, 3};

        //print array before sorting
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        //sort an array using bubble sort algorithm
        bubbleSort(intArray);

        System.out.println("");

        //print array after sorting
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }

    private static void bubbleSort(int[] intArray) {

        int n = intArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (intArray[j - 1] > intArray[j]) {
                    //swap the elements!
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }

    }
}