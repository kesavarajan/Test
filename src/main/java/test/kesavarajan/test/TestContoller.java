package test.kesavarajan.test;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;

public class TestContoller {
	@GetMapping("/test")
	public String Loginuser() throws IOException {

		return "Test";

	}
}
