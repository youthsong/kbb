package com.kbb.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kbb.core.pojo.Color;
import com.kbb.core.service.ColorService;

@Controller
@RequestMapping("/color")
public class ColorController {
	@Autowired
	private ColorService colorService;
	
	@RequestMapping("/colorList")
	public String colorList(Model model){
		List<Color> list = colorService.findAll();
		model.addAttribute("list", list);
		System.out.println(list);
		return "color";
	}
}
