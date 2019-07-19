package io.github.dnloop.data;

public class MainData {
    private Unit temperature;

    private int pressure;

    private int humidity;

    private double tempMin;

    private double tempMax;

    private int seaLevel;

    private int groundLevel;

    public MainData() {
    }

    public MainData(Unit temperature, int pressure, int humidity, int seaLevel, int groundLevel) {
	super();
	this.temperature = temperature;
	this.pressure = pressure;
	this.humidity = humidity;
	this.seaLevel = seaLevel;
	this.groundLevel = groundLevel;
    }

    public Unit getTemperature() {
	return temperature;
    }

    public void setTemperature(Unit temperature) {
	this.temperature = temperature;
    }

    public int getPressure() {
	return pressure;
    }

    public void setPressure(int pressure) {
	this.pressure = pressure;
    }

    public int getHumidity() {
	return humidity;
    }

    public void setHumidity(int humidity) {
	this.humidity = humidity;
    }

    public double getTempMin() {
	return tempMin;
    }

    public void setTempMin(double tempMin) {
	this.tempMin = tempMin;
    }

    public double getTempMax() {
	return tempMax;
    }

    public void setTempMax(double tempMax) {
	this.tempMax = tempMax;
    }

    public int getSeaLevel() {
	return seaLevel;
    }

    public void setSeaLevel(int seaLevel) {
	this.seaLevel = seaLevel;
    }

    public int getGroundLevel() {
	return groundLevel;
    }

    public void setGroundLevel(int groundLevel) {
	this.groundLevel = groundLevel;
    }

    @Override
    public String toString() {
	return "MainData [temperature=" + temperature + ", pressure=" + pressure + ", humidity=" + humidity
		+ ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", seaLevel=" + seaLevel + ", groundLevel="
		+ groundLevel + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + groundLevel;
	result = prime * result + humidity;
	result = prime * result + pressure;
	result = prime * result + seaLevel;
	long temp;
	temp = Double.doubleToLongBits(tempMax);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(tempMin);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
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
	MainData other = (MainData) obj;
	if (groundLevel != other.groundLevel)
	    return false;
	if (humidity != other.humidity)
	    return false;
	if (pressure != other.pressure)
	    return false;
	if (seaLevel != other.seaLevel)
	    return false;
	if (Double.doubleToLongBits(tempMax) != Double.doubleToLongBits(other.tempMax))
	    return false;
	if (Double.doubleToLongBits(tempMin) != Double.doubleToLongBits(other.tempMin))
	    return false;
	if (temperature != other.temperature)
	    return false;
	return true;
    }

}
