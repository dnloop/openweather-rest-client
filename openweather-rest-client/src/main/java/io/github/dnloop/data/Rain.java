package io.github.dnloop.data;

public class Rain {
    private float oneHour;

    private float threeHours;

    public Rain() {
    }

    public Rain(float oneHour, float threeHours) {
	super();
	this.oneHour = oneHour;
	this.threeHours = threeHours;
    }

    public float getOneHour() {
	return oneHour;
    }

    public void setOneHour(float oneHour) {
	this.oneHour = oneHour;
    }

    @Override
    public String toString() {
	return "Rain [oneHour=" + oneHour + ", threeHours=" + threeHours + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(oneHour);
	result = prime * result + Float.floatToIntBits(threeHours);
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
	Rain other = (Rain) obj;
	if (Float.floatToIntBits(oneHour) != Float.floatToIntBits(other.oneHour))
	    return false;
	if (Float.floatToIntBits(threeHours) != Float.floatToIntBits(other.threeHours))
	    return false;
	return true;
    }

}
