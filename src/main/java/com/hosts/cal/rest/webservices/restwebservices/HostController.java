package com.hosts.cal.rest.webservices.restwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostController {

	@RequestMapping(method=RequestMethod.GET,path = "/calculate-hosts")
	public String calculateHosts() {
		return "Inside the calculate hosts";
	}
	
	@GetMapping(path = "/showData")
	public HostData showData() {
		return new HostData("inside the data");
		
	}
	
}
