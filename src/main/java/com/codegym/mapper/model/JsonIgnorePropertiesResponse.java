package com.codegym.mapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class JsonIgnorePropertiesResponse {

    private String name = "Peter";
    private Integer age = 18;
    @JsonIgnoreProperties(value = {"province"})
    private Address address = new Address();

    @Data
    public static class Address{
        private String country = "VN";
        private String province = "Ha Noi";
    }
}

