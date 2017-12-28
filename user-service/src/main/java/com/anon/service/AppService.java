package com.anon.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("app-service")
@RequestMapping(value = "/app/test")
public interface AppService {

	@RequestMapping(value = "/appConfigRead")
	String appConfigRead(@RequestParam(value = "name")String name);


}
