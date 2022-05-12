package Crew;

public class Pilot extends Crew{
    private String licenseNumber;

    public Pilot(String name, CrewRank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
