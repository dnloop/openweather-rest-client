package io.github.dnloop.units;

import static org.junit.Assert.assertThat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.core.IsNull;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.github.dnloop.OpenweatherRestClientApplicationTests;
import io.github.dnloop.data.Cloud;
import io.github.dnloop.data.Coordinate;
import io.github.dnloop.data.MainData;
import io.github.dnloop.data.Rain;
import io.github.dnloop.data.Snow;
import io.github.dnloop.data.System;
import io.github.dnloop.data.Unit;
import io.github.dnloop.data.Weather;
import io.github.dnloop.data.WeatherData;
import io.github.dnloop.data.Wind;

public class Default extends Tester {

    private Logger log = LogManager.getLogger(OpenweatherRestClientApplicationTests.class);

    private Cloud cloud;

    private Coordinate coord;

    private Rain rain;

    private Snow snow;

    private System sys;

    private Wind wind;

    private Weather weather;

    private MainData main;

    private WeatherData complete;

    public Default() {
	super();
	getMapper().enable(SerializationFeature.WRAP_ROOT_VALUE, SerializationFeature.INDENT_OUTPUT);
	cloud = new Cloud(25);
	coord = new Coordinate(37.39, -122.08);
	rain = new Rain(0.0, 0.0);
	snow = new Snow(0.0, 5.0);
	sys = new System(5122, 1, 0.0139, "US", 1560343627, 1560396563);
	wind = new Wind(1.5, 350);
	weather = new Weather(800, "Clear", "clear sky", "01d");
	main = new MainData(Unit.FARENHEIT, 296.71, 1013, 53, 294.82, 298.71, 1013, 1013);
	complete = new WeatherData(420006353, "stations", 1560350645, -25200, "Mountain View", 200, main, cloud, rain,
		coord, wind, sys, snow, weather);
    }

    public boolean runTest() {
	String result = new String();
	try {
	    result = getMapper().writeValueAsString(complete);
	    assertThat(result, IsNull.notNullValue());
	    log.info(result);
	} catch (JsonProcessingException e) {
	    // TODO Auto-generated catch block
	    log.error(e.getMessage());
	    return false;
	}
	return true;
    }
}
