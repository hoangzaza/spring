package com.hoangnv.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hoangnv.entity.ChiTietGioHang;
import com.hoangnv.service.NhanVienService;

@Controller
@RequestMapping("api/")
@SessionAttributes({ "tendangnhap", "giohang" })
public class ApiController {

	List<ChiTietGioHang> chiTietGioHangs;
	@Autowired
	NhanVienService nhanVienService;

	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String dangNhap(@RequestParam("tendangnhap") String tenDangNhap, @RequestParam("matkhau") String matKhau,
			ModelMap modelMap) {

		modelMap.addAttribute("tendangnhap", tenDangNhap);
		// nó sẽ tự động thêm vào session
		return nhanVienService.kiemTraDangNhap(tenDangNhap, matKhau) + "";
	}

	@GetMapping("ThemGioHang")
	public void themGioHang(@RequestParam("masp") int masp, @RequestParam("mamau") int maMau,
			@RequestParam("masize") int maSize, @RequestParam("soluong") int soLuong, HttpSession httpSession) {
		if (httpSession == null) {
			chiTietGioHangs = new ArrayList<ChiTietGioHang>();
			ChiTietGioHang chiTiet = new ChiTietGioHang(masp, maMau, maSize, soLuong);
			chiTietGioHangs.add(chiTiet);
			httpSession.setAttribute("giohang", chiTietGioHangs);

		} else {
			chiTietGioHangs=(List<ChiTietGioHang>) httpSession.getAttribute("giohang");
			ChiTietGioHang chiTiet=new ChiTietGioHang(masp,maMau,maSize,soLuong);
			chiTietGioHangs.add(chiTiet);
		}
		
		httpSession.setAttribute("giohang", chiTietGioHangs);
		System.out.println(((List<ChiTietGioHang>) httpSession.getAttribute("giohang")).size());

	}
}
