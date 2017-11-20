package com.cts.hellodocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
	
	@RequestMapping("/helloworld")
	public String getAllTopics() {
		return "Welcome to OpenShift Application....!!!!";
	}


}
