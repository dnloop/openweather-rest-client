package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "coord")
public class Coordinate {
    @JsonProperty("lat")
    private double latitude;

    @JsonProperty("lon")
    private double longitude;

    public Coordinate() {
    }

    public Coordinate(double latitude, double longitude) {
	super();
	this.latitude = latitude;
	this.longitude = longitude;
    }

    public double getLatitude() {
	return latitude;
    }

    public void setLatitude(double latitude) {
	this.latitude = latitude;
    }

    @Override
    public String toString() {
	return "Coordinate [latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(latitude);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(longitude);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Coordinate other = (Coordinate) obj;
	if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
	    return false;
	if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
	    return false;
	return true;
    }

}
