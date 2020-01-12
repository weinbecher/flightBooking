public class Passenger {
    private String name;
    private int bag;

    public Passenger(String name, int bag) {
        this.name = name;
        this.bag = bag;
    }

    public String getName() {
        return this.name;
    }


    public int getBag() {
        return this.bag;
    }

    public int getBagWeight() {
        return this.bag * 20;
    }
}
