//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package Home_work_5.task1;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class phoneBook {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.put("Павлов", Arrays.asList("32424525", "23454534"));
        map.put("Александров", Arrays.asList("567567", "7567567"));
        map.put("Водянюк", Arrays.asList("567567", "567567"));

        printPhoneBook(map);
        // findСontact(map);
        //createOrUpdateContact(map);
    }

    private static void printPhoneBook(Map<String, List<String>> phoneB) {
        for (Entry<String, List<String>> entry : phoneB.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }

    private static void findСontact(Map<String, List<String>> phoneB) {
        System.out.print("Введите фамилию с большой буквы: ");
        String name = input.next();
        if (phoneB.containsKey(name))
            System.out.print(phoneB.get(name));
        else
            System.out.print("Такого контакта нет!");
    }


    private static void createOrUpdateContact(Map<String, List<String>> phoneB){

        System.out.print("Введите фамилию абонента с большой буквы: ");
        String firstname = input.next();
        if (phoneB.containsKey(firstname)) {
            System.out.print("Такой абонент существует! \n1 - добавить еще номер к существующему\n" +
                    "2 - добавить другого абонента (измените имя)\n");
            int whatDo = input.nextInt();
            if (whatDo == 1){
                System.out.print("Введите номер ");
                String phone = input.next();
                ArrayList<String> oldPhone = new ArrayList<>(phoneB.get(firstname));
                oldPhone.add(phone);
                phoneB.put(firstname, oldPhone);
                printPhoneBook(phoneB);
            }
            if (whatDo == 2) createOrUpdateContact(phoneB);
        }
        else {
            System.out.print("Введите номер:");
            String phone = input.next();
            phoneB.put(firstname, Arrays.asList(phone));
            System.out.println("Контакт добавлен!");
            printPhoneBook(phoneB);
        }
        
    }
    

    private static void deleteContact(Map<String, List<String>> phoneB){

    }
}
