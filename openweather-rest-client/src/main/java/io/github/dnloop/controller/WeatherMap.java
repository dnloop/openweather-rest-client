package io.github.dnloop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherMap {

    @GetMapping("/map")
    public String getMap(@RequestParam(name = "lat", required = false, defaultValue = "40.76494") String lat,
	    @RequestParam(name = "lon", required = false, defaultValue = "-73.97987") String lon, Model model) {
	model.addAttribute("lat", lat);
	model.addAttribute("lon", lon);
	return "map";
    }
}
