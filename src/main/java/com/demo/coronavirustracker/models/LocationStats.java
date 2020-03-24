package com.demo.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int prevDayCases;

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

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getPrevDayCases() {
        return prevDayCases;
    }

    public void setPrevDayCases(int prevDayCases) {
        this.prevDayCases = prevDayCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", prevDayCases=" + prevDayCases +
                '}';
    }
}
