package io.github.dnloop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.dnloop.data.WeatherData;

@RestController
public class CurrentWeatherData {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    public WeatherData byCityName(@RequestParam(defaultValue = "London") String name) {
	return restTemplate.getForObject(Setting.defaultUrl + "/weather?q=" + name + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    public WeatherData byCityName(@RequestParam(defaultValue = "London") String name, String code) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/weather?q=" + name + "," + code + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    public WeatherData byCityID(@RequestParam(defaultValue = "2172797") String id) {
	return restTemplate.getForObject(Setting.defaultUrl + "/weather?id=" + id + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    public WeatherData byGeoCoord(@RequestParam(defaultValue = "139") String lon,
	    @RequestParam(defaultValue = "35") String lat) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/weather?lat=" + lat + "&lon=" + lon + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    public WeatherData byZipCode(@RequestParam(defaultValue = "94040") String zip) {
	return restTemplate.getForObject(Setting.defaultUrl + "/weather?zip=" + zip + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    } // default US

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    public WeatherData byZipCode(@RequestParam(defaultValue = "94040") String zip,
	    @RequestParam(defaultValue = "us") String code) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/weather?zip=" + zip + "," + code + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/box")
    public WeatherData withinRectangle(
	    @RequestParam(defaultValue = "12") String lonLeft,
	    @RequestParam(defaultValue = "32") String latBottom,
	    @RequestParam(defaultValue = "15") String lonRight,
	    @RequestParam(defaultValue = "37") String latTop,
	    @RequestParam(defaultValue = "10") String zoom) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/box/city?bbox=" 
			+ lonLeft + "," 
			+ latBottom + "," 
			+ lonRight + "," 
			+ latTop + "," 
			+ zoom + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    } // limit of 25 square degrees
    
    @RequestMapping(method = RequestMethod.GET, value = "/box")
    public WeatherData withinRectangle(
	    @RequestParam(defaultValue = "12") String lonLeft,
	    @RequestParam(defaultValue = "32") String latBottom,
	    @RequestParam(defaultValue = "15") String lonRight,
	    @RequestParam(defaultValue = "37") String latTop,
	    @RequestParam(defaultValue = "10") String zoom,
	    @RequestParam(defaultValue = "yes") String cluster,
	    @RequestParam(defaultValue = "en") String lang) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/box/city?bbox=" 
			+ lonLeft + "," 
			+ latBottom + "," 
			+ lonRight + "," 
			+ latTop + "," 
			+ zoom + "&lang=" + lang + "&cluster=" + cluster + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    } // limit of 25 square degrees
    
    @RequestMapping(method = RequestMethod.GET, value = "/find")
    public WeatherData inCycle(
	    @RequestParam(defaultValue = "37") String lon,
	    @RequestParam(defaultValue = "55.5") String lat,
	    @RequestParam(defaultValue = "10") String cnt) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/find?lat=" + lat 
		+ "&lon=" + lon + "&cnt=" + cnt + "&APPID=" + Setting.getApi(),
		WeatherData.class);
    } // limit of 25 square degrees
    
    @RequestMapping(method = RequestMethod.GET, value = "/find")
    public WeatherData inCycle(
	    @RequestParam(defaultValue = "37") String lon,
	    @RequestParam(defaultValue = "55.5") String lat,
	    @RequestParam(defaultValue = "10") String cnt,
	    @RequestParam(defaultValue = "yes") String cluster,
	    @RequestParam(defaultValue = "en") String lang, String callback) {
	return restTemplate.getForObject(
		Setting.defaultUrl + "/find?lat=" + lat 
		+ "&lon=" + lon + "&cnt=" + cnt 
		+ "&cluster=" + cluster + "&lang=" + lang 
		+ "&callback=" + callback
		+ "&APPID=" + Setting.getApi(),
		WeatherData.class);
    } // limit of 25 square degrees
    
}
