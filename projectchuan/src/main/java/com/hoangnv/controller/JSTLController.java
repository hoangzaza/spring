package com.hoangnv.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoangnv.entity.NhanVien;

@Controller
@RequestMapping("jstl/")
public class JSTLController {
	@GetMapping
	public String Default(ModelMap modelMap) {
		modelMap.addAttribute("ten","Nguyen Van Hoang");
		modelMap.addAttribute("tuoi",22);
		ArrayList< NhanVien> arr=new ArrayList<NhanVien>();
		NhanVien a=new NhanVien("Hoang NV", 18);
		NhanVien b=new NhanVien("PTKA", 22);
		arr.add(a);
		arr.add(b);
		modelMap.addAttribute("listnhanvien", arr);
		return "jstl";
	}

}
