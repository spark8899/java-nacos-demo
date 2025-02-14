package com.example.controller;

import com.example.config.ConfigProperties;
import com.example.config.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigController {

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private CommonConfig commonConfig;

    @GetMapping("/config")
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("appConfig", configProperties.getValue());
        config.put("commonConfig", commonConfig.getValue());
        return config;
    }
}
