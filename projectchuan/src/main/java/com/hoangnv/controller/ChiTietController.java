package com.hoangnv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hoangnv.entity.DanhMucSanPham;
import com.hoangnv.entity.SanPham;
import com.hoangnv.service.DanhMucService;
import com.hoangnv.service.SanPhamService;

@SessionAttributes("giohang")
@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	
	@GetMapping("/{masanpham}")
	public String Default(@PathVariable("masanpham") int maSanPham,ModelMap modelMap) {
		SanPham sanPham= sanPhamService.layChiTietSanPham(maSanPham);
		List<DanhMucSanPham> arr=danhMucService.getListCategory();
		modelMap.addAttribute("sanpham",sanPham );
		modelMap.addAttribute("danhmuc", arr);
		return "chitiet";
	}
	
	//truyền đối tượng sang jsp dùng modelattribute 
//	@PostMapping
//	public String hienThiThongTin(@ModelAttribute NhanVien nv,ModelMap modelMap) {
//		modelMap.addAttribute("nv", nv);
//		return "chitiet";
//	}
	

}
