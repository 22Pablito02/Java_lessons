package Home_work_2.task2;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class bubbleSort {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(bubbleSort.class.getName());
        FileHandler fh = new FileHandler("C:/Users/Pavel/Desktop/Учеба/Курсы/Java_lessons/Home_work_2/task2/log.xml",
                false);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        // System.out.println(Arrays.toString((random())));
        int[] arr = new int[] { 8, 4, 2, 5, 7, 1, 3, 9, 6, 0 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr, logger)));

    }

    public static int[] sort(int[] sortArr, Logger logger) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.info("Current: " + sortArr[j] + " Replaceable: " + sortArr[j + 1]);
                }
            }
        }
        return sortArr;
    }

    // public static int[] random() {
    // int[] array = new int[10];
    // for (int i = 0; i < array.length; i++) {
    // array[i] = ((int) (Math.random() * 10));
    // System.out.println(array[i]);
    // }
    // return array;
    // }

}
