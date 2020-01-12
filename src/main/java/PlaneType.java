public enum PlaneType {
    A380(575,  575000),
    A340(380, 380000),
    A330_300( 440, 242000),
    A330_200( 406, 242000);

    private int Capacity;
    private int TotalWeight;

    PlaneType(int capacity, int totalWeight) {
        Capacity = capacity;
        TotalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.Capacity;
    }

    public int getTotalWeight() {
        return this.TotalWeight;
    }
}
