package p_001;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class fibonach {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger();

        long startTimeProcess = System.currentTimeMillis();
        System.out.printf("%d-ое число фибоначчи равно: %d. Число итераций: %d\n",
                30, searchFibonachiRec(30, counter), counter.get());
        long finishTimeProcess = System.currentTimeMillis();
        long timeProcess = finishTimeProcess - startTimeProcess;
        System.out.printf("    Время процесса: %d мс\n", timeProcess);


        counter.set(0);
        startTimeProcess = System.currentTimeMillis();
        System.out.printf("%d-ое число фибоначчи равно: %d. Число итераций: %d\n",
                40, searchFibonachiRec(40, counter), counter.get());
        finishTimeProcess = System.currentTimeMillis();
        timeProcess = finishTimeProcess - startTimeProcess;
        System.out.printf("    Время процесса: %d мс\n", timeProcess);

        counter.set(0);
        startTimeProcess = System.currentTimeMillis();
        System.out.printf("%d-ое число фибоначчи равно: %d. Число итераций: %d\n",
                40, searchFibonachi(40, counter), counter.get());
        finishTimeProcess = System.currentTimeMillis();
        timeProcess = finishTimeProcess - startTimeProcess;
        System.out.printf("    Время процесса: %d мс\n", timeProcess);

        counter.set(0);
        startTimeProcess = System.currentTimeMillis();
        System.out.printf("%d-ое число фибоначчи равно: %d. Число итераций: %d\n",
                150, searchFibonachi(150, counter), counter.get());
        finishTimeProcess = System.currentTimeMillis();
        timeProcess = finishTimeProcess - startTimeProcess;
        System.out.printf("    Время процесса: %d мс\n", timeProcess);


    }

    public static long searchFibonachiRec(int num, AtomicInteger counter) {
        counter.incrementAndGet();
        if (num == 0 || num == 1) return num;
        return (searchFibonachiRec(num - 1, counter) + searchFibonachiRec(num - 2, counter));


    }

    public static long searchFibonachi(int num, AtomicInteger counter){
        if (num == 0 || num == 1) return num;
        long[] numbers = new long[num+1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i <= num; i++){
            numbers[i] = numbers[i-1]+numbers[i-2];
            counter.incrementAndGet();
        }
        return numbers[num];
    }


}