package com.hoangnv.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hoangnv.entity.MatHang;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	SessionFactory mySessionFactory;
	//autowired nó sẽ lấy bean có id cùng tên với cái này
	
//	phương thức get giống với @RequestMapping(path="/", method=RequestMethod.GET) khi không có tham số nó sẽ nhảy vào đây
	@GetMapping
	@Transactional
	public String Default(ModelMap modelMap) {
		Session session=mySessionFactory.getCurrentSession();
		//select * thì không cần điền vào còn nếu lấy ít trường hơn thì cần select
		String sql="from MatHang";
		List<MatHang> list=session.createQuery(sql).getResultList();
		for(MatHang mh:list) {
			System.out.println(mh.getTenMatHang());
		}
		return "trangchu";
	}
	
//	có nhận tham số pathvariable
//	@RequestMapping("/{hoten}")
//	public String NhanThamSo(@PathVariable("hoten") String hoten,ModelMap modelMap) {
//		modelMap.addAttribute("hoten", hoten);
//		return "trangchu";
//	}
	
	
	@PostMapping
	public String themNhanVien(@RequestParam("tenNhanVien") String tenNhanVien,@RequestParam("tuoi") int tuoi) {
		return "trangchu";
	}
	
}
