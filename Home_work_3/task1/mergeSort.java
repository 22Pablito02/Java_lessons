package Home_work_3.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mergeSort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] sortArr = getArray();
        System.out.println(Arrays.toString(sortArr));
        int[] result = mergSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

       
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static int random(int rndCount) {
        Random rnd = new Random();
        int num = rnd.nextInt(1, rndCount);
        return num;

    }

    public static int[] getArray() {
        System.out.print("Введите размер массива: ");
        int arrSize = input.nextInt();
        int[] tampArr = new int[10];
        for (int i = 0; i < arrSize; i++) {
            tampArr[i] = random(10);
        }
        return tampArr;
    }
}
