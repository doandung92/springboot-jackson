package com.codegym.mapper.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
@JsonRootName("student")
public class WrapName {
    private String name = "Peter";
    private Integer age = 18;
}
