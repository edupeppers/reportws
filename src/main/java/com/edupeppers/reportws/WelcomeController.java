package com.edupeppers.reportws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET}, value = { "/welcome" }, headers = "Accept=application/json")
	@ResponseBody
	public String welcome() {
		return "Welcome to ReportWs Framework... :)";
	}
}
