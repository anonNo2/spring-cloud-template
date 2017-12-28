package com.anon.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-service")
@RequestMapping(value = "/appService")
public interface UserService {

	@RequestMapping(value = "/connectApp")
	public String ConnectApp(@RequestParam(value = "name") String name);


}
