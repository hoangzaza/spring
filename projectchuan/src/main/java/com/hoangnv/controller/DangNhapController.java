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
	@Autowired
	NhanVienService nhanVienService;
	
	@GetMapping
	public String Default() {
		return "dangnhap";
	}
	
	@PostMapping
	public String dangKy(@RequestParam("tendangnhapdangky") String tenDangNhap,@RequestParam("matkhaudangky") String matKhau,@RequestParam("nhaplaimatkhau") String nhapLaiMK,ModelMap modelMap) {
		if(matKhau.equals(nhapLaiMK)) {
			NhanVien nhanVien=new NhanVien();
			nhanVien.setTenDangNhap(tenDangNhap);
			nhanVien.setMatKhau(matKhau);
			boolean kt=nhanVienService.themNhanVien(nhanVien);
			if(kt==true) {
				modelMap.addAttribute("kiemtradangnhap", "Tạo tài khoản thành công !");
			}else {
				modelMap.addAttribute("kiemtradangnhap", "Tạo tài khoản thất bại !");
			}
		}else {
			modelMap.addAttribute("kiemtradangnhap", "mật khẩu không khớp !");
		}
		
		return "dangnhap";
	}
	

}
