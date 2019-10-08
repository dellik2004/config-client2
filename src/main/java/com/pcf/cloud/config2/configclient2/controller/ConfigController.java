package com.pcf.cloud.config2.configclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {


    @Value("${spring.bms.keyGravity}")
    private String gravityTitle;

    @Value("${spring.bms.key}")
    private String bmsCommon;

    @RequestMapping(value = "/getProperty" )
    public String getMessage() throws Exception {
        return "Common Message: "+ bmsCommon + " -- Gravity Message:: " +gravityTitle;
    }

}
