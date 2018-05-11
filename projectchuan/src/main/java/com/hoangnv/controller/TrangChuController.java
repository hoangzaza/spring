package com.hoangnv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
//	phương thức get giống với @RequestMapping(path="/", method=RequestMethod.GET) khi không có tham số nó sẽ nhảy vào đây
	@GetMapping
	public String Default() {
		return "trangchu";
	}
	
//	có nhận tham số pathvariable
//	@RequestMapping("/{hoten}")
//	public String NhanThamSo(@PathVariable("hoten") String hoten,ModelMap modelMap) {
//		modelMap.addAttribute("hoten", hoten);
//		return "trangchu";
//	}
	
	
}
