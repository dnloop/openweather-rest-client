package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "cloud")
public class Cloud {
    @JsonProperty("all")
    private int cloudiness;

    public Cloud() {
    }

    public Cloud(int cloudiness) {
	super();
	this.cloudiness = cloudiness;
    }

    public int getCloudiness() {
	return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
	this.cloudiness = cloudiness;
    }

    @Override
    public String toString() {
	return "Cloud [cloudiness=" + cloudiness + "]";
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Cloud other = (Cloud) obj;
	if (cloudiness != other.cloudiness)
	    return false;
	return true;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + cloudiness;
	return result;
    }
}
