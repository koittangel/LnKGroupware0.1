package com.lnk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lnk.service.EmpService;

@Controller
public class EmpWebController {
	
	@Autowired 
	private EmpService empService;
	
	// 
	
}
