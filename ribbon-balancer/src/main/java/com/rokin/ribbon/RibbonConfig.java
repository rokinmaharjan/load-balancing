package com.rokin.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;

@Configuration
public class RibbonConfig {
	
	@Bean
	public IPing getPing() {
		return new PingUrl();
	}
	
}
