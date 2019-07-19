package io.github.dnloop.data;

public class Configuration {
    private String apiKey;

    private int limit;

    public String getApiKey() {
	return apiKey;
    }

    public void setApiKey(String apiKey) {
	this.apiKey = apiKey;
    }

    public Configuration() {
    }

    @Override
    public String toString() {
	return "Configuration [apiKey=" + apiKey + ", limit=" + limit + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((apiKey == null) ? 0 : apiKey.hashCode());
	result = prime * result + limit;
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
	Configuration other = (Configuration) obj;
	if (apiKey == null) {
	    if (other.apiKey != null)
		return false;
	} else if (!apiKey.equals(other.apiKey))
	    return false;
	if (limit != other.limit)
	    return false;
	return true;
    }

}
