package com.sw.spring.web;

import com.sw.spring.web.service.list.ListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
	private final ListService listService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("lists", listService.findAllDesc());

		return "index";
	}
}
