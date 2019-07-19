package io.github.dnloop.data;

public class Wind {
    private float speed;

    private int degrees;

    public Wind() {
    }

    public Wind(float speed, int degrees) {
	super();
	this.speed = speed;
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
	result = prime * result + Float.floatToIntBits(speed);
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
	if (Float.floatToIntBits(speed) != Float.floatToIntBits(other.speed))
	    return false;
	return true;
    }

}
