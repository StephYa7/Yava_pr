package p_002_sort;


import java.util.concurrent.atomic.AtomicInteger;

public class BinarySearch {

    public static void main(String[] args) {


        AtomicInteger counter = new AtomicInteger();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        System.out.printf("Позиция искомого числа: %d, колличество итерраций: %d ",
                binarySearch(array, 22, counter), counter.get());

    }


    public static int binarySearch(int[] array, int value, AtomicInteger counter) {
        return binarySearch(array, value, 0, array.length - 1, counter);
    }

    public static int binarySearch(int[] array, int value, int min, int max, AtomicInteger counter) {
        counter.incrementAndGet();


        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max, counter);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(array, value, min, midpoint - 1, counter);
            } else {

                return midpoint;
            }
        }
    }
}