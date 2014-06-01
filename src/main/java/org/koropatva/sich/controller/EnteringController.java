package org.koropatva.sich.controller;

import org.koropatva.sich.entity.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnteringController {

	private static final String URI = "/sich/*";

	@RequestMapping(value = URI, method = RequestMethod.GET)
	public @ResponseBody
	Message find() {
		return new Message();
	}

	@RequestMapping(value = URI, method = RequestMethod.DELETE)
	public @ResponseBody
	Message remove() {
		return new Message();
	}

}
