public class Passenger {
    private String name;
    private int bag;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int bag, Flight flight) {
        this.name = name;
        this.bag = bag;
        this.flight = flight;
        this.seatNumber = Integer.valueOf(getSeatNumber());

    }

    public String getName() {
        return this.name;
    }

    public int getSeatNumber(){
        int min=1;
        int max=flight.availableSeat();
        return this.seatNumber = (int)(Math.random() * max + min);
    }

    public int getBag() {
        return this.bag;
    }

    public int getBagWeight() {
        return this.bag * 20;
    }

    public Flight getFlight() {
        return this.flight;
    }


    public void bookFlight(Flight flight) {
         this.flight = flight;
    }


}
