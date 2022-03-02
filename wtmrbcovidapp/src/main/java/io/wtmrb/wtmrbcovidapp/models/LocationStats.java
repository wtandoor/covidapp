package io.wtmrb.wtmrbcovidapp.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int date;
    private int prevDate;
    private int difference;


    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPrevDate() {
        return prevDate;
    }

    public void setPrevDate(int prevDate) {
        this.prevDate = prevDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", date='" + date + '\'' +
                ", prevDate='" + prevDate + '\'' +
                '}';
    }
}
