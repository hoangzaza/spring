package com.hoangnv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoangnv.dao.NhanVienDAO;
import com.hoangnv.imp.NhanVienImp;

@Service
public class NhanVienService implements NhanVienImp {
	@Autowired
	NhanVienDAO nhanVienDAO;

	public boolean kiemTraDangNhap(String tenDangNhap,String matKhau) {
		
		return nhanVienDAO.kiemTraDangNhap(tenDangNhap, matKhau);
	}
	
}
