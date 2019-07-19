package io.github.dnloop.data;

public enum Unit {

    CELSIUS("metric"), FARENHEIT("imperial");

    private final String unit;

    Unit(String unit) {
	this.unit = unit;
    }

    public String unit() {
	return unit;
    }
}
