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
        int[] array2 = new int[]{1, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 4, 58, 45, 56, 24, 52, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 63, 4, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 458, 4, 556, 2452, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 63, 4, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 458, 45, 56, 2452, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 63, 4, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4, 2, 5, 6, 7, 45, 546, 47, 458, 45, 56, 2452, 36, 647, 75, 67, 56, 75, 6
                , 7567, 56756, 7, 56, 3, 45, 5, 634, 5, 99, 5, 31, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
                , 4};
        int[] array3 = new int[]{1, 5, 6, 7, 8, 4, 2, 1, 6, 55, 2, 31
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
        long startTime = System.nanoTime();
        bubbleSort(array2, counter);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.printf("Пузырьковая сортировка. Колличество итерраций: %d", counter.get());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.printf("    Время процесса 1: %d \n", duration / 1000);


        counter.set(0);
        startTime = System.nanoTime();

        directSort(array, counter);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.printf("Сортировка выбором. Колличество итерраций: %d", counter.get());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.printf("    Время процесса 2: %d \n", duration / 1000);

        counter.set(0);
        startTime = System.nanoTime();

        insertSort(array3, counter);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.printf("Сортировка вставками. Колличество итерраций: %d", counter.get());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.printf("    Время процесса 2: %d \n", duration / 1000);
    }


    public static void bubbleSort(int[] array, AtomicInteger counter) {
        boolean finished;

        do {
            finished = true;

            for (int i = 0; i < array.length - 1; i++) {
                counter.incrementAndGet();
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finished = false;
                    counter.incrementAndGet();
                }
            }
        } while (!finished);
    }

    public static void directSort(int[] array, AtomicInteger counter) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                counter.incrementAndGet();
                if (array[j] < array[minPosition]) {
                    minPosition = j;

                }
            }
            if (i != minPosition) {

                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void insertSort(int[] array, AtomicInteger counter) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                counter.incrementAndGet();
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
    }
}