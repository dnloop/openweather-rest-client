package io.github.dnloop.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "weather")
public class Weather {

    @JsonProperty("id")
    private int id;

    @JsonProperty("main")
    private String main;

    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String icon;

    public Weather() {
    }

    public Weather(int id, String main, String description, String icon) {
	super();
	this.id = id;
	this.main = main;
	this.description = description;
	this.icon = icon;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getMain() {
	return main;
    }

    public void setMain(String main) {
	this.main = main;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getIcon() {
	return icon;
    }

    public void setIcon(String icon) {
	this.icon = icon;
    }

    @Override
    public String toString() {
	return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((icon == null) ? 0 : icon.hashCode());
	result = prime * result + id;
	result = prime * result + ((main == null) ? 0 : main.hashCode());
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
	Weather other = (Weather) obj;
	if (description == null) {
	    if (other.description != null)
		return false;
	} else if (!description.equals(other.description))
	    return false;
	if (icon == null) {
	    if (other.icon != null)
		return false;
	} else if (!icon.equals(other.icon))
	    return false;
	if (id != other.id)
	    return false;
	if (main == null) {
	    if (other.main != null)
		return false;
	} else if (!main.equals(other.main))
	    return false;
	return true;
    }
}
