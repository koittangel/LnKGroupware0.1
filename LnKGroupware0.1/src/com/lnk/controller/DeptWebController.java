package com.lnk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lnk.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptWebController {
	@Autowired
	private DeptService deptService;

}
