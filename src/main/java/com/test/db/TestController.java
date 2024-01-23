package com.test.db;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TestController {
	private final TestService testService;

	@GetMapping("nomal")
	public String nomal() {
		testService.nomal();
		return "실행 완료";
	}
}
