package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {
    @JsonProperty("id")
    private int id;

    @JsonProperty("base")
    private String base;

    @JsonProperty("dt")
    private long dataTime;

    @JsonProperty("timezone")
    private int timezone;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private int code;

    @JsonProperty("main")
    private MainData mainData;

    @JsonProperty("cloud")
    private Cloud cloud;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("coord")
    private Coordinate coordinate;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("sys")
    private System system;

    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("weather")
    private Weather weather;

    public WeatherData() {
    }

    public WeatherData(int id, String base, long dataTime, int timezone, String name, int code, MainData mainData,
	    Cloud cloud, Rain rain, Coordinate coordinate, Wind wind, System system, Snow snow, Weather weather) {
	super();
	this.id = id;
	this.base = base;
	this.dataTime = dataTime;
	this.timezone = timezone;
	this.name = name;
	this.code = code;
	this.mainData = mainData;
	this.cloud = cloud;
	this.rain = rain;
	this.coordinate = coordinate;
	this.wind = wind;
	this.system = system;
	this.snow = snow;
	this.weather = weather;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getBase() {
	return base;
    }

    public void setBase(String base) {
	this.base = base;
    }

    public long getDataTime() {
	return dataTime;
    }

    public void setDataTime(long dataTime) {
	this.dataTime = dataTime;
    }

    public int getTimezone() {
	return timezone;
    }

    public void setTimezone(int timezone) {
	this.timezone = timezone;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getCode() {
	return code;
    }

    public void setCode(int code) {
	this.code = code;
    }

    public MainData getMainData() {
	return mainData;
    }

    public void setMainData(MainData mainData) {
	this.mainData = mainData;
    }

    public Cloud getCloud() {
	return cloud;
    }

    public void setCloud(Cloud cloud) {
	this.cloud = cloud;
    }

    public Rain getRain() {
	return rain;
    }

    public void setRain(Rain rain) {
	this.rain = rain;
    }

    public Coordinate getCoordinate() {
	return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
	this.coordinate = coordinate;
    }

    public Wind getWind() {
	return wind;
    }

    public void setWind(Wind wind) {
	this.wind = wind;
    }

    public System getSystem() {
	return system;
    }

    public void setSystem(System system) {
	this.system = system;
    }

    public Snow getSnow() {
	return snow;
    }

    public void setSnow(Snow snow) {
	this.snow = snow;
    }

    public Weather getWeather() {
	return weather;
    }

    public void setWeather(Weather weather) {
	this.weather = weather;
    }

    @Override
    public String toString() {
	return "WeatherData [id=" + id + ", base=" + base + ", dataTime=" + dataTime + ", timezone=" + timezone
		+ ", name=" + name + ", code=" + code + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((base == null) ? 0 : base.hashCode());
	result = prime * result + ((cloud == null) ? 0 : cloud.hashCode());
	result = prime * result + code;
	result = prime * result + ((coordinate == null) ? 0 : coordinate.hashCode());
	result = prime * result + (int) (dataTime ^ (dataTime >>> 32));
	result = prime * result + id;
	result = prime * result + ((mainData == null) ? 0 : mainData.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((rain == null) ? 0 : rain.hashCode());
	result = prime * result + ((snow == null) ? 0 : snow.hashCode());
	result = prime * result + ((system == null) ? 0 : system.hashCode());
	result = prime * result + timezone;
	result = prime * result + ((weather == null) ? 0 : weather.hashCode());
	result = prime * result + ((wind == null) ? 0 : wind.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	WeatherData other = (WeatherData) obj;
	if (base == null) {
	    if (other.base != null)
		return false;
	} else if (!base.equals(other.base))
	    return false;
	if (cloud == null) {
	    if (other.cloud != null)
		return false;
	} else if (!cloud.equals(other.cloud))
	    return false;
	if (code != other.code)
	    return false;
	if (coordinate == null) {
	    if (other.coordinate != null)
		return false;
	} else if (!coordinate.equals(other.coordinate))
	    return false;
	if (dataTime != other.dataTime)
	    return false;
	if (id != other.id)
	    return false;
	if (mainData == null) {
	    if (other.mainData != null)
		return false;
	} else if (!mainData.equals(other.mainData))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (rain == null) {
	    if (other.rain != null)
		return false;
	} else if (!rain.equals(other.rain))
	    return false;
	if (snow == null) {
	    if (other.snow != null)
		return false;
	} else if (!snow.equals(other.snow))
	    return false;
	if (system == null) {
	    if (other.system != null)
		return false;
	} else if (!system.equals(other.system))
	    return false;
	if (timezone != other.timezone)
	    return false;
	if (weather == null) {
	    if (other.weather != null)
		return false;
	} else if (!weather.equals(other.weather))
	    return false;
	if (wind == null) {
	    if (other.wind != null)
		return false;
	} else if (!wind.equals(other.wind))
	    return false;
	return true;
    }

}
