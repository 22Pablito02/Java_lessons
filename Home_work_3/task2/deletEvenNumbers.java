// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Home_work_3.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class deletEvenNumbers {

    public static void main(String[] args) throws IOException {

        List<Integer> intNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            intNumbers.add(random(10));
        }
        System.out.println(intNumbers);
        for (int i = 0; i < intNumbers.size(); i++) {
            if (intNumbers.get(i) % 2 == 0) {
                intNumbers.remove(i);
                i--;
            }
        }
        
        // Collections.sort(intNumbers);
        System.out.println(intNumbers);

    }

    public static int random(int rndCount) {
        Random rnd = new Random();
        int num = rnd.nextInt(1, rndCount);
        return num;

    }

}
