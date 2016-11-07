package be.wtcdegrysperre;

/**
 * Created by Pieter on 12/10/2016.
 */

public class RankingRecord {
    private final String firstName;
    private final String lastName;
    private final int rides;

    public RankingRecord(String firstName, String lastName, int rides) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rides = rides;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRides() {
        return rides;
    }
}
