package com.hoangnv.imp;

import com.hoangnv.entity.NhanVien;

public interface NhanVienImp {
	boolean kiemTraDangNhap(String tenDangNhap,String matKhau);
	boolean themNhanVien(NhanVien nhanVien);
}
