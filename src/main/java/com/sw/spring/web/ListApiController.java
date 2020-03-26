package com.sw.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw.spring.web.dto.ListSaveRequestDto;
import com.sw.spring.web.service.list.ListService;

@RestController
public class ListApiController {
	@Autowired
	private ListService listService;
	
	@PostMapping("/api/v1/lists")
	public Long save(@RequestBody ListSaveRequestDto requestDto) {
		return listService.save(requestDto);
	}
}
