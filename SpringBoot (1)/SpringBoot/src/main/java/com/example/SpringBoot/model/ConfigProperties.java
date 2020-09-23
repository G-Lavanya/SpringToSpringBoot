package com.example.SpringBoot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {

	private String hostName;
	private int port;
	private String from;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	/*
	 * @Value("${value.from.file}") private String fromConfig;
	 * 
	 * public String getFromConfig() { return fromConfig; } public void
	 * setFromConfig(String fromConfig) { this.fromConfig = fromConfig; }
	 */

	// standard getters and setters

}
