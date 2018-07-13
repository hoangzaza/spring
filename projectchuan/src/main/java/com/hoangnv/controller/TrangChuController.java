package com.hoangnv.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hoangnv.entity.SanPham;
import com.hoangnv.service.SanPhamService;


@Controller
@RequestMapping("/")
@SessionAttributes("tendangnhap")
public class TrangChuController {
	@Autowired
	SanPhamService sanPhamService;
	
	@GetMapping
	@Transactional
	public String Default(ModelMap modelMap,HttpSession httpSession) {
		if(httpSession.getAttribute("tendangnhap")!=null) {
			String tenDangNhap=(String) httpSession.getAttribute("tendangnhap");
			String chuCaiDau=tenDangNhap.substring(0, 1).toUpperCase();
			modelMap.addAttribute("chucaidau", chuCaiDau);
			//lấy session bên controller
			
		}
		List<SanPham> liSanPhams=sanPhamService.layDanhSachSPlimit(0);
		modelMap.addAttribute("listsanpham", liSanPhams);
		
		
		return "trangchu";
	}
	
//	có nhận tham số pathvariable
//	@RequestMapping("/{hoten}")
//	public String NhanThamSo(@PathVariable("hoten") String hoten,ModelMap modelMap) {
//		modelMap.addAttribute("hoten", hoten);
//		return "trangchu";
//	}
	
	
//	@PostMapping
//	@Transactional
//	public String themNhanVien(@RequestParam("tenNhanVien") String tenNhanVien,@RequestParam("tuoi") int tuoi) {
//		Session session=mySessionFactory.getCurrentSession();
//		NhanVien nv=new NhanVien(tenNhanVien, tuoi);
//		//them nhan vien
//		session.save(nv);
//		return "trangchu";
//	}
	
	//one to one
//	NhanVien nv=new NhanVien();
////	nv.setIdNhanVien(4);
//	nv.setTenNhanVien("NVH");
//	nv.setTuoi(22);
//	
//	MatHang mh=new MatHang();
//	mh.setIdMatHang(3);
//	mh.setTenMatHang("hangf 1");
//	mh.setGia(10000);
//	mh.setMoTa("day la mo ta");
//	mh.setNhanVien(nv);
//	
//	session.save(mh);
//	
////	//update nhan vien
////	NhanVien nv=(NhanVien)session.createQuery("from NhanVien where Tuoi=90").getSingleResult();
////	nv.setTuoi(69);
////	session.update(nv);
////	
////	//xoa nhan vien
////	NhanVien nv1=(NhanVien)session.createQuery("from NhanVien where Tuoi=69").getSingleResult();
////	session.delete(nv1);
////	
//	
//	//select * thì không cần điền vào còn nếu lấy ít trường hơn thì cần select
//	String sql="from NhanVien1";
//	List<NhanVien> list=session.createQuery(sql).getResultList();
//	for(NhanVien nhanVien:list) {
//		System.out.println(nhanVien.getTenNhanVien()+nhanVien.getTuoi());
//	}
	
}
