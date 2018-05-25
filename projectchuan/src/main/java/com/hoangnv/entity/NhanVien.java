package com.hoangnv.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="NhanVien")
public class NhanVien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaNhanVien")
	private int maNhanVien;
	@Column(name="TenNhanVien")
	private String tenNhanVien;
	@Column(name="DiaChi")
	private String diaChi;
	@Column(name="GioiTinh")
	private boolean gioiTinh;
	@Column(name="CMND")
	private String CMND;	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MaChucVu")
	ChucVu chucVu;
	@Column(name="Email")
	private String email;
	@Column(name="TenDangNhap")
	private String tenDangNhap;
	@Column(name="MatKhau")
	private String matKhau;
	
	public NhanVien(int maNhanVien, String tenNhanVien, String diaChi, boolean gioiTinh, String cMND, ChucVu chucVu,
			String email, String tenDangNhap, String matKhau) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		CMND = cMND;
		this.chucVu = chucVu;
		this.email = email;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public int getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public NhanVien(int maNhanVien, String tenNhanVien, String diaChi, boolean gioiTinh, String cMND, ChucVu chucVu,
			String email) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		CMND = cMND;
		this.chucVu = chucVu;
		this.email = email;
	}
	public NhanVien() {
		super();
	}
	
	
	
}
