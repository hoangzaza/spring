package com.hoangnv.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hoangnv.entity.NhanVien;
import com.hoangnv.imp.NhanVienImp;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
// có transaction thì nó sẽ bao bọc bởi proxy nên phải cho dòng này vào để cho
// thằng này hiểu là proxy bên kia autowise sẽ không lỗi nữa
public class NhanVienDAO implements NhanVienImp {
	@Autowired
	SessionFactory mySessionFactory;

	@Transactional
	public boolean kiemTraDangNhap(String tenDangNhap, String matKhau) {
		Session session = mySessionFactory.getCurrentSession();

		try {
			String sql = "from NhanVien where TenDangNhap= '" + tenDangNhap + "' and MatKhau ='" + matKhau + "'";
			NhanVien nhanVien = (NhanVien) session.createQuery(sql).getSingleResult();
			if (nhanVien != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	@Transactional
	public boolean themNhanVien(NhanVien nhanVien) {
		Session session = mySessionFactory.getCurrentSession();
		int id = (Integer) session.save(nhanVien);
		if (id != -1) {
			return true;
		} else {
			return false;
		}
	}

}
