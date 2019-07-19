package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "wind")
public class Wind {
    @JsonProperty("speed")
    private double speed;

    @JsonProperty("deg")
    private int degrees;

    public Wind() {
    }

    public Wind(double d, int degrees) {
	super();
	this.speed = d;
	this.degrees = degrees;
    }

    public int getDegrees() {
	return degrees;
    }

    public void setDegrees(int degrees) {
	this.degrees = degrees;
    }

    @Override
    public String toString() {
	return "Wind [speed=" + speed + ", degrees=" + degrees + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + degrees;
	long temp;
	temp = Double.doubleToLongBits(speed);
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
	Wind other = (Wind) obj;
	if (degrees != other.degrees)
	    return false;
	if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
	    return false;
	return true;
    }

}
