package com.demo.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private String latestTotalCases;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(String latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases='" + latestTotalCases + '\'' +
                '}';
    }
}
