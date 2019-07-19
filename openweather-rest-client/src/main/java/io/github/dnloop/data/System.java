package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "sys")
public class System {
    @JsonProperty("id")
    private int id;

    @JsonProperty("type")
    private int type;

    @JsonProperty("message")
    private double message;

    @JsonProperty("country")
    private String country;

    @JsonProperty("sunrise")
    private long sunrise;

    @JsonProperty("sunset")
    private long sunset;

    public System() {
    }

    public System(int id, int type, double message, String country, long sunrise, long sunset) {
	super();
	this.id = id;
	this.type = type;
	this.message = message;
	this.country = country;
	this.sunrise = sunrise;
	this.sunset = sunset;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getType() {
	return type;
    }

    public void setType(int type) {
	this.type = type;
    }

    public double getMessage() {
	return message;
    }

    public void setMessage(double message) {
	this.message = message;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public long getSunrise() {
	return sunrise;
    }

    public void setSunrise(long sunrise) {
	this.sunrise = sunrise;
    }

    public long getSunset() {
	return sunset;
    }

    public void setSunset(long sunset) {
	this.sunset = sunset;
    }

    @Override
    public String toString() {
	return "System [id=" + id + ", type=" + type + ", message=" + message + ", country=" + country + ", sunrise="
		+ sunrise + ", sunset=" + sunset + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((country == null) ? 0 : country.hashCode());
	result = prime * result + id;
	long temp;
	temp = Double.doubleToLongBits(message);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + (int) (sunrise ^ (sunrise >>> 32));
	result = prime * result + (int) (sunset ^ (sunset >>> 32));
	result = prime * result + type;
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
	System other = (System) obj;
	if (country == null) {
	    if (other.country != null)
		return false;
	} else if (!country.equals(other.country))
	    return false;
	if (id != other.id)
	    return false;
	if (Double.doubleToLongBits(message) != Double.doubleToLongBits(other.message))
	    return false;
	if (sunrise != other.sunrise)
	    return false;
	if (sunset != other.sunset)
	    return false;
	if (type != other.type)
	    return false;
	return true;
    }

}
