package com.example.SpringBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.model.ConfigProperties;

@RestController
public class ConfigPropController {
	@Autowired
	ConfigProperties conf;
	
    @Value("${welcome.message}")
    private String name;

    @GetMapping("/welcome")
    public String retrieve() {
    	return name;
    }
    
    @GetMapping("/property")
    public Map dynamicConfig() {
    	Map map = new HashMap();
    	map.put("From", conf.getFrom());
    	map.put("Hostname", conf.getHostName());
    	map.put("to", conf.getPort());
    	
    	
		return map;
    	
    }

   
}
