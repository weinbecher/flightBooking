public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getPlaneTypeCapacity() {
         return this.planeType.getCapacity();
    }

    public int getPlaneTypeTotalWeight() {
        return this.planeType.getTotalWeight();
    }
}
