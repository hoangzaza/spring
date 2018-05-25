package com.hoangnv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hoangnv.service.NhanVienService;

@Controller
@RequestMapping("api/")
@SessionAttributes("tendangnhap")
public class ApiController {
	
	@Autowired
	NhanVienService nhanVienService;
	
	@GetMapping("KiemTraDangNhap")
	@Transactional
	@ResponseBody
	public String dangNhap(@RequestParam("tendangnhap") String tenDangNhap,@RequestParam("matkhau") String matKhau,ModelMap modelMap) {
		modelMap.addAttribute("tendangnhap",tenDangNhap);
		
		return nhanVienService.kiemTraDangNhap(tenDangNhap, matKhau)+"";
	}

}
