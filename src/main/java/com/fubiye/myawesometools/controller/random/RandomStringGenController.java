package com.fubiye.myawesometools.controller.random;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "RandomStringGenController")
@RestController
@RequestMapping("/random")
public class RandomStringGenController {

    @GetMapping("")
    @ApiImplicitParams({@ApiImplicitParam(
            name = "length", value = "length of generated string", defaultValue = "8", dataType = "Integer"
    )})
    public String defaultWithLength(int length){
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
