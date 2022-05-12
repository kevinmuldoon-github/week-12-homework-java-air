package Plane;

public enum PlaneType {
    BOEING747(162, 41400),
    AIRBUSA320(180, 77000),
    BOMBARDIERCRJ200(52, 24040),
    EMBRAERE175(88, 40370);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
