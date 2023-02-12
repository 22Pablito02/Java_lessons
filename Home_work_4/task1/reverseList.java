// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Home_work_4.task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class reverseList {
    
public static void main(String[] args) {
    
    List<String> startList = new LinkedList<>();
    startList.add("счастья!)");
    startList.add("тебе");
    startList.add("желаю");
    startList.add("Уважаемый,");

    System.out.println(startList);
    System.out.println(createReversList(startList));
    
}

public static List<String> createReversList(List<String> firstList) {
    List<String> reverse = new LinkedList<>();
    for(int i = firstList.size() - 1 ; i >= 0; i--){
        reverse.add(firstList.get(i));
    }
    return reverse;

}


public static int random(int rndCount) {
    Random rnd = new Random();
    int num = rnd.nextInt(1, rndCount);
    return num;

}




}
