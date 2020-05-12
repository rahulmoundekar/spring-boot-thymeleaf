package com.app.springbootthymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String view() {
		return "index";
	}

	@ModelAttribute("list")
	public List<String> Cities() {
		List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Nagpur");
		return list;
	}

}
