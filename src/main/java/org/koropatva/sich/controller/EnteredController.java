package org.koropatva.sich.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.koropatva.sich.entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnteredController {

	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public @ResponseBody
	Greeting save(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,
				name));
	}

	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public @ResponseBody
	Greeting select(@RequestBody Greeting greeting) {
		return greeting;
	}

}
