package com.troue.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.troue.rest.response.Echo;

@RestController
public class TroueEndpoint {

	@GetMapping("/echo")
	public Echo echo() {
		return new Echo("Hello World!");
	}

}
