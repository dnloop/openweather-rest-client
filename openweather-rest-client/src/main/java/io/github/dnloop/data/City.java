package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("city")
public class City {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("coord")
    private Coordinate coordinate;

    @JsonProperty("country")
    private String country;

    @JsonProperty("timezone")
    private int timezone;

}
