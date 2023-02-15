// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, 
// которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package Home_work_5.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class duplicateNames {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> namesList = new ArrayList<String>(
                Arrays.asList("Павел", "Акакий", "Андрей", "Павел", "Джордж", "Павел", "Андрей"));

        for (String name : namesList) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else if (map.containsKey(name)) {
                int counter = map.get(name) + 1;
                map.replace(name, counter);
            }
        }
        System.out.println(map);
        System.out.println(sortByValue(map));
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        List<Map.Entry<String, Integer>> listForSort = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        Collections.sort(listForSort, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                    Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        Collections.reverse(listForSort);
        for (Map.Entry<String, Integer> entry : listForSort) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
