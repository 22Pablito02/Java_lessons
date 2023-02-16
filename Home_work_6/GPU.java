package Home_work_6;

public class GPU {

    private String manufacturer;
    private String model;
    private int memory;

    public GPU(String manufacturer, String model, int memory) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.memory = memory;
    }







    
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof GPU))// если объект проверки не является типом laptop
            return false;
            GPU other = (GPU) obj;
        if (this.manufacturer == other.manufacturer && this.model == other.model && this.memory == other.memory)
            return true;
        else
            return false;
    }


}
