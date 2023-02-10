package Home_work_3.task3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class minMaxAvgMean {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(random(100));
        }

        int avg = 0;
        for (int i = 0; i < arr.size(); i++) {
            avg += arr.get(i);
        }
        avg /= arr.size();
        System.out.println(arr);
        System.out.printf("Минимальное значение: %d\nМаксимальное значение: %d\nСреднее ариф. значение: %d", Collections.min(arr), Collections.max(arr), avg);
    }

    public static int random(int rndCount) {
        Random rnd = new Random();
        int num = rnd.nextInt(1, rndCount);
        return num;

    }

}
