package io.github.dnloop.units;

import com.fasterxml.jackson.databind.ObjectMapper;

abstract class Tester {

    private ObjectMapper mapper;

    Tester() {
	this.mapper = new ObjectMapper();
    }

    public ObjectMapper getMapper() {
	return mapper;
    }

    public void setMapper(ObjectMapper mapper) {
	this.mapper = mapper;
    }

}
