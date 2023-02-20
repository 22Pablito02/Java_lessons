package Home_work_6;

import java.util.*;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static Laptop necesariasСriterias = new Laptop();

    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<Laptop>();

        Laptop lp = new Laptop("windows", "black", 8, 512);
        lp.addGpu(new GPU("nvideo", "rtx3080", 8));
        laptops.add(lp);

        lp = new Laptop("linux", "grey", 4, 228);
        lp.addGpu(new GPU("nvideo", "rtx3070", 8));
        laptops.add(lp);

        lp = new Laptop("macOS", "spaceGray", 16, 1024);
        lp.addGpu(new GPU("nvideo", "rtx3090", 16));
        laptops.add(lp);

        lp = new Laptop("windows", "green", 8, 512);
        lp.addGpu(new GPU("nvideo", "rtx3080", 8));
        laptops.add(lp);

        Map<String, String> test = new HashMap<>();
        test = checkLaptop();
        String str = "";

        System.out.println("Найдены следующие товары:");
        for (Laptop el : laptops) {
            if (el.equals(necesariasСriterias)) {
                System.out.println(el);
            }
        }

        for (Laptop element : laptops) {
            str = element.toString();
            for (String elem : test.values())
                if (str.contains(elem))
                    System.out.println(str);
            str = "";
        }
    }

    private static Map checkLaptop() {
        Map<String, String> criterias = new HashMap<>();

        System.out.println("Укажитете критерии модели\n1 - Операционная система\n2 - Цвет" +
                "3 - RAM(ОЗУ - опретивная память) \n4 - Объем жесткого диска\n5 - Процессор\n6 - Выберите этот пункт"
                +
                "для начала поиска по вышеуказанным критериям\n");
        while (true) {
            String position = input.nextLine();
            if (position.equals("6"))
                break;
            if (position.equals("1")) {
                System.out.println("Операционная система windows/linux?");
                String os = input.next();
                criterias.put(position, os);
                necesariasСriterias.setOS(os);
            }
            if (position.equals("2")) {
                System.out.println("Цвет? например black");
                String color = input.next();
                criterias.put(position, color);
                necesariasСriterias.setColor(color);
            }

            if (position.equals("3")) {
                System.out.println("Какой объем оперативной памяти Вас интересует?");
                String ram = input.next();
                criterias.put(position, ram);
                necesariasСriterias.setRam(Integer.parseInt(ram));
            }

            if (position.equals("4")) {
                System.out.println("Какой объем жесткого диска Вас интересует?");
                String hdd = input.next();
                criterias.put(position, hdd);
                necesariasСriterias.setSsd(Integer.parseInt(hdd));
            }
            if (position.equals("5")) {
                System.out.println("Выбирите модель процессора");
                GPU model = findCpu();
                criterias.put(position, model.toString());
                necesariasСriterias.addGpu(model);
            }
        }
        System.out.println("Вы выбрали следующие критерии");
        System.out.println(necesariasСriterias);

        return criterias;
    }

    private static GPU findCpu() {
        System.out.println("Укажитете фирму производителя: ");
        String manufacturer = input.next();
        System.out.println("Модель: ");
        String model = input.next();
        System.out.println("Объем памяти: ");
        int memory = input.nextInt();
        GPU needModel = new GPU(manufacturer, model, memory);
        return needModel;
    }

}