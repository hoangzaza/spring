package com.hoangnv.imp;

import java.util.List;

import com.hoangnv.entity.SanPham;

public interface SanPhamImp {
	List<SanPham> layDanhSachSPlimit(int spDau);
	SanPham layChiTietSanPham(int masp);
}
