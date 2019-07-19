package io.github.dnloop.data;

public class Coordinate {
    private double latitude;

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
