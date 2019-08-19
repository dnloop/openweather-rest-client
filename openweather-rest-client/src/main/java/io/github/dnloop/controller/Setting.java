package io.github.dnloop.controller;

import java.util.prefs.Preferences;

import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties.Settings;

import io.github.dnloop.data.Unit;

public class Setting {
    public static final String defaultUrl = "http://api.openweathermap.org/data/2.5";

    public static final String API = "APPID";

    private static final String URL = "url";

    private static final String UNIT = "units";

    private static final String CITY = "city";

    private static Preferences settings;

    public static void initDefault() {
	settings = Preferences.userNodeForPackage(Settings.class);
	settings.get(URL, defaultUrl);
	settings.get(API, "default");
	settings.get(UNIT, Unit.CELSIUS.unit());
	settings.get(CITY, "default");
	settings.put(URL, defaultUrl);
	settings.put(API, "default");
	settings.put(UNIT, Unit.CELSIUS.unit());
	settings.put(CITY, "London");
    }

    public static String getApi() {
	return settings.get(API, "default");
    }

    public static String getUrl() {
	return settings.get(URL, defaultUrl);
    }

    public static String getCity() {
	return settings.get(CITY, "default");
    }

    public static void setApi(String api) {
	settings.put(API, api);
    }

    public static void setUrl(String url) {
	settings.put(URL, url);
    }

    public static void setCity(String city) {
	settings.put(CITY, city);
    }
}
