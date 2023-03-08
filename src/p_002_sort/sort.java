package p_002_sort;

import java.util.concurrent.atomic.AtomicInteger;

public class sort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 4, 58, 45, 56, 24, 52, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 63, 4, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 458, 4, 556, 2452, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 63, 4, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 458, 45, 56, 2452, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 63, 4, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 458, 45, 56, 2452, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 634, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4};
        AtomicInteger counter = new AtomicInteger();
        long startTimeProcess = System.currentTimeMillis();
        bubbleSort(array, counter);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.printf("Колличество итерраций: %d", counter.get());
        long finishTimeProcess = System.currentTimeMillis();
        long timeProcess = finishTimeProcess - startTimeProcess;
        System.out.printf("    Время процесса: %d мс\n", timeProcess);
    }


    public static void bubbleSort(int[] array, AtomicInteger counter) {
        boolean finished;

        do {
            finished = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter.incrementAndGet();
                    finished = false;
                }
            }
        } while (!finished);
    }
}