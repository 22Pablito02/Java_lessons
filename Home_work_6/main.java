package Home_work_6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<Laptop>();

        Laptop lp = new Laptop("windows", "black", 8, 512);
        lp.addGpu(new GPU("nvideo", "rtx3080", 8));
        laptops.add(lp);

        Laptop lp = new Laptop("windows", "black", 8, 512);
        lp.addGpu(new GPU("nvideo", "rtx3080", 8));
        laptops.add(lp);

        Laptop lp = new Laptop("windows", "black", 8, 512);
        lp.addGpu(new GPU("nvideo", "rtx3080", 8));
        laptops.add(lp);

        Laptop lp = new Laptop("windows", "black", 8, 512);
        lp.addGpu(new GPU("nvideo", "rtx3080", 8));
        laptops.add(lp);

        

        System.out.println(laptops);
    }
}