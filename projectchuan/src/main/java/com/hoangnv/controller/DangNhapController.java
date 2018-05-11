package com.hoangnv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {
	@GetMapping
	public String Default() {
		return "dangnhap";
	}
	
	@PostMapping
	public String dangNhap(@RequestParam("tenDangNhap") String tenDangNhap,@RequestParam("matKhau") String matKhau) {
		if(tenDangNhap.equals("hoangnv")&& matKhau.equals("hoang123")) {
			return "redirect:/";
		} else {
			return "dangnhap";
		}
	}
}
