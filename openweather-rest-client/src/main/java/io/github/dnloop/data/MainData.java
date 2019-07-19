package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "main")
public class MainData {

    private Unit unit;

    @JsonProperty("temp")
    private double temperature;

    @JsonProperty("pressure")
    private int pressure;

    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("temp_min")
    private double tempMin;

    @JsonProperty("temp_max")
    private double tempMax;

    @JsonProperty("sea_level")
    private int seaLevel;

    @JsonProperty("grnd_level")
    private int groundLevel;

    public MainData() {
    }

    public MainData(Unit unit, double temperature, int pressure, int humidity, double tempMin, double tempMax,
	    int seaLevel, int groundLevel) {
	super();
	this.unit = unit;
	this.temperature = temperature;
	this.pressure = pressure;
	this.humidity = humidity;
	this.tempMin = tempMin;
	this.tempMax = tempMax;
	this.seaLevel = seaLevel;
	this.groundLevel = groundLevel;
    }

    public Unit getUnit() {
	return unit;
    }

    public void setUnit(Unit unit) {
	this.unit = unit;
    }

    public double getTemperature() {
	return temperature;
    }

    public void setTemperature(double temperature) {
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
	return "MainData [unit=" + unit + ", temperature=" + temperature + ", pressure=" + pressure + ", humidity="
		+ humidity + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", seaLevel=" + seaLevel
		+ ", groundLevel=" + groundLevel + "]";
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
	temp = Double.doubleToLongBits(temperature);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
	if (Double.doubleToLongBits(temperature) != Double.doubleToLongBits(other.temperature))
	    return false;
	if (unit != other.unit)
	    return false;
	return true;
    }

}
