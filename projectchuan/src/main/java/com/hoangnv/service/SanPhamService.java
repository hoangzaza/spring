package com.hoangnv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoangnv.dao.SanPhamDAO;
import com.hoangnv.entity.SanPham;
import com.hoangnv.imp.SanPhamImp;

@Service
public class SanPhamService implements SanPhamImp{
	
	@Autowired
	SanPhamDAO sanPhamDAO;
	public List<SanPham> layDanhSachSPlimit(int spDau) {
		return sanPhamDAO.layDanhSachSPlimit(spDau);
	}
	public SanPham layChiTietSanPham(int masp) {
		// TODO Auto-generated method stub
		return sanPhamDAO.layChiTietSanPham(masp);
	}

}
