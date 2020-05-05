package io.github.dnloop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.dnloop.data.Forecast;

@RestController
public class ForecastData {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(method = RequestMethod.GET, value = "/forecast", params = {"name", "country"})
    public Forecast byCityName(
	    @RequestParam(defaultValue = "London") String name,
	    @RequestParam(defaultValue = "uk") String country) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/forecast?q=" + name + "," + country + "&APPID=" + Setting.getApi(),
		Forecast.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/forecast", params = {"id"})
    public Forecast byCityID(@RequestParam(defaultValue = "524901") String id) {
	return restTemplate.getForObject(Setting.defaultUrl + "/forecast?id=" + id + "&APPID=" + Setting.getApi(),
		Forecast.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/forecast", params = {"lat", "lon"})
    public Forecast byGeoCoord(
	    @RequestParam(defaultValue = "139") String lon,
	    @RequestParam(defaultValue = "35") String lat) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/forecast?lat=" + lat + "&lon=" + lon + "&APPID=" + Setting.getApi(),
		Forecast.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/forecast", params = {"zip"})
    public Forecast byZipCode(@RequestParam(defaultValue = "94040") String zip) {
	return restTemplate.getForObject(Setting.defaultUrl + "/forecast?zip=" + zip + "&APPID=" + Setting.getApi(),
		Forecast.class);
    } // default US
}
