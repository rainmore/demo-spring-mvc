package com.springapp.mvc.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class JsonObjectMapper extends ObjectMapper {

    public JsonObjectMapper() {
        super();
        this.registerModule(new JodaModule());
        this.configure(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS , false);
    }
}
