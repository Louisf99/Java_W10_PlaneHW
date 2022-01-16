public class Passenger extends Person{
    private int bags;

    public Passenger(String name, int bags){
        super(name);
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }
}