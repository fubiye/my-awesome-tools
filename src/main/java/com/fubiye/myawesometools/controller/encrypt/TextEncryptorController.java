package com.fubiye.myawesometools.controller.encrypt;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/enc")
public class TextEncryptorController {

    @GetMapping("")
    @ApiImplicitParams({
      @ApiImplicitParam(name = "salt", required = true, dataType = "String"),
      @ApiImplicitParam(name = "input", value = "Input string to be encrypted", required = true, dataType = "String")
    })
    public String basicTextEncrypt(String salt,String input){
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword(salt);
        return encryptor.encrypt(input);
    }
}
