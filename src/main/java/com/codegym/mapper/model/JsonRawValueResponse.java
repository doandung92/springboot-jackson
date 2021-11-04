package com.codegym.mapper.model;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Data;

@Data
public class JsonRawValueResponse {
    private String name = "Peter";

    @JsonRawValue
    private String rawData = "{ \"age\": 18}";
}
