package com.hoangnv.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hoangnv.entity.SanPham;
import com.hoangnv.imp.SanPhamImp;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp {
	
	@Autowired
	SessionFactory mySessionFactory;
	@Transactional
	public List<SanPham> layDanhSachSPlimit(int spDau) {
		Session session=mySessionFactory.getCurrentSession();
		List<SanPham> ds=session.createQuery("from SanPham where MaSanPham > "+spDau +" and MaSanPham <= "+(spDau+20)).getResultList();
		return ds;
	}
	@Transactional
	public SanPham layChiTietSanPham(int masp) {
		Session session=mySessionFactory.getCurrentSession();
		String query="from SanPham where MaSanPham ="+masp;
		SanPham sanPham=(SanPham) session.createQuery(query).getSingleResult();
		System.out.println(sanPham.getMaSanPham()+sanPham.getGiaTien());
		System.out.println(sanPham.getDanhSachChiTiet().size());
		return sanPham;
	}
	
}
