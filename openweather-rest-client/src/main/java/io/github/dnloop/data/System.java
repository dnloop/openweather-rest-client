package io.github.dnloop.data;

public class System {
    private int id;

    private String type;

    private String message;

    private String country;

    private long sunrise;

    private long sunset;

    public System() {
    }

    public System(int id, String type, String message, String country, long sunrise, long sunset) {
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

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
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
	result = prime * result + ((message == null) ? 0 : message.hashCode());
	result = prime * result + (int) (sunrise ^ (sunrise >>> 32));
	result = prime * result + (int) (sunset ^ (sunset >>> 32));
	result = prime * result + ((type == null) ? 0 : type.hashCode());
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
	if (message == null) {
	    if (other.message != null)
		return false;
	} else if (!message.equals(other.message))
	    return false;
	if (sunrise != other.sunrise)
	    return false;
	if (sunset != other.sunset)
	    return false;
	if (type == null) {
	    if (other.type != null)
		return false;
	} else if (!type.equals(other.type))
	    return false;
	return true;
    }

}
