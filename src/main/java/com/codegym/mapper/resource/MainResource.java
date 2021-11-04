package com.codegym.mapper.resource;

import com.codegym.mapper.model.JsonFormatResponse;
import com.codegym.mapper.model.JsonIgnorePropertiesResponse;
import com.codegym.mapper.model.JsonRawValueResponse;
import com.codegym.mapper.model.WrapName;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainResource {

    @GetMapping("/wrap-name")
    public WrapName getWrapName() {
        return new WrapName();
    }

    @GetMapping("/json-format")
    public JsonFormatResponse jsonFormat() {
        return new JsonFormatResponse();
    }

    @GetMapping("/raw-value")
    public JsonRawValueResponse raw() {
        return new JsonRawValueResponse();
    }

    @GetMapping("/json")
    public JsonIgnorePropertiesResponse json() {
        return new JsonIgnorePropertiesResponse();
    }
}
