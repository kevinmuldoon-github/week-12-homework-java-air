package Crew;

public abstract class Crew {
    private String name;
    private CrewRank rank;

    public Crew(String name, CrewRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CrewRank getRank() {
        return rank;
    }
}
