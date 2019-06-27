package com.lakmisystems.lakmiprizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/report")

public class Report {
	@RequestMapping(method=RequestMethod.POST)
    public @ResponseBody void createPrice() {
        
    }
}
