package io.github.dnloop.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private float message;

    @JsonProperty("city")
    private City city;

    @JsonProperty("list")
    private List<ForecastList> list;

    @JsonProperty("cnt")
    private int cnt;
}
