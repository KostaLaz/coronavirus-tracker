package com.demo.coronavirustracker.models;

import lombok.Data;

@Data
public class LocationStats {
    private String state;
    private String country;
    private String latestTotalCases;

}
