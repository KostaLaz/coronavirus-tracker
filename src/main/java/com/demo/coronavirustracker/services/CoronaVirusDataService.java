package com.demo.coronavirustracker.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class CoronaVirusDataService {

    private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_19-covid-Confirmed.csv";

    public void fetchVirusData(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create(VIRUS_DATA_URL))
                   .build();

    }
}
