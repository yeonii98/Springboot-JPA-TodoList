package com.ajy.todo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	//http://localhost:8000/test/hello
	@GetMapping("test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
