package com.hoangnv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoangnv.dao.DanhMucDAO;
import com.hoangnv.entity.DanhMucSanPham;
import com.hoangnv.imp.DanhMucImp;
@Service
public class DanhMucService implements DanhMucImp{
	
	@Autowired
	DanhMucDAO danhMucDAO;
	public List<DanhMucSanPham> getListCategory() {
		// TODO Auto-generated method stub
		return danhMucDAO.getListCategory();
	}

}
