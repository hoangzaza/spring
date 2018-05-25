package com.hoangnv.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hoangnv.entity.NhanVien;
import com.hoangnv.service.NhanVienService;

@Controller
@RequestMapping("dangnhap/")
@SessionAttributes("tendangnhap")
public class DangNhapController {

	@GetMapping
	public String Default() {
		return "dangnhap";
	}

}
