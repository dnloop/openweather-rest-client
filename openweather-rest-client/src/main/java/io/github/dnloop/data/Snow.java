package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "snow")
public class Snow {
    @JsonProperty("1h")
    private double oneHour;

    @JsonProperty("3h")
    private double threeHours;

    public Snow() {
    }

    public Snow(double d, double e) {
	super();
	this.oneHour = d;
	this.threeHours = e;
    }

    public Snow(double threeHours) {
	super();
	this.threeHours = threeHours;
    }

    public double getThreeHours() {
	return threeHours;
    }

    public void setThreeHours(double threeHours) {
	this.threeHours = threeHours;
    }

    public double getOneHour() {
	return oneHour;
    }

    public void setOneHour(double oneHour) {
	this.oneHour = oneHour;
    }

    @Override
    public String toString() {
	return "Snow [oneHour=" + oneHour + ", threeHours=" + threeHours + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(oneHour);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(threeHours);
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
	Snow other = (Snow) obj;
	if (Double.doubleToLongBits(oneHour) != Double.doubleToLongBits(other.oneHour))
	    return false;
	if (Double.doubleToLongBits(threeHours) != Double.doubleToLongBits(other.threeHours))
	    return false;
	return true;
    }

}
