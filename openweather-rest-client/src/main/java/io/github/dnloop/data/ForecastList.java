package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastList {
    @JsonProperty("dt")
    private long dataTime;

    @JsonProperty("main")
    private MainData main;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("cloud")
    private Cloud cloud;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("dt_txt")
    private String dtTxt;
}
