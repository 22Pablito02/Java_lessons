package Home_work_6;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

    private String os;
    private String color;
    private int ram;
    private int ssd;
    private List<GPU> videoСards = new ArrayList<>();

    public Laptop(String os, String color, int ram, int ssd) {
        this.ssd = ssd;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    public Laptop(){
        this("","",0,0);
    }

    public void addGpu(GPU gpu){
        this.videoСards.add(gpu);
    }





    @Override
    public String toString() {
        return "Laptop {" +
                "ram=" + ram +
                ", ssd=" + ssd +
                ", os=" + os + ", color=" + color + "\n" + videoСards +
                "}";
    }


@Override
public boolean equals (Object obj) {
    if (obj == this)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Laptop))
        return false;
        Laptop other = (Laptop) obj;
    if (this.ram == other.ram && this.ssd == other.ssd && this.os.equals(other.os)&&
            this.color.equals(other.color) && this.videoСards.equals(other.videoСards))
        return true;
    else return false;
}




}