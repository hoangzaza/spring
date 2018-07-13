package com.hoangnv.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hoangnv.entity.DanhMucSanPham;
import com.hoangnv.imp.DanhMucImp;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucDAO implements DanhMucImp{
	@Autowired
	SessionFactory mySessionFactory;
	@Transactional
	public List<DanhMucSanPham> getListCategory() {
		Session session=mySessionFactory.getCurrentSession();
		String sql="from DanhMucSanPham";
		List<DanhMucSanPham> arr=session.createQuery(sql).getResultList();
		return arr;
	}
	


}
