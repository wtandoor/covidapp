package io.wtmrb.wtmrbcovidapp.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLatestTotalCase(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCase=" + latestTotalCases +
                '}';
    }
}
