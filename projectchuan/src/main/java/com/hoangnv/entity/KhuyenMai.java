package com.hoangnv.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="KhuyenMai")
public class KhuyenMai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaKM")
	private int maKM;
	@Column(name="TenKM")
	private String tenKM;
	@Column(name="ThoiGianBatDau")
	private String thoiGianBatDau;
	@Column(name="ThoiGianKetThuc")
	private String thoiGianKetThuc;
	@Column(name="MoTa")
	private String moTa;
	@Column(name="HinhKhuyenMai")
	private String hinhKhuyenMai;
	@Column(name="GiamGia")
	private int giamGia;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ChiTietKhuyenMai",
	joinColumns= {@JoinColumn(name="MaKM",referencedColumnName="MaKM")},
	inverseJoinColumns= {@JoinColumn(name="MaSanPham",referencedColumnName="MaSanPham")})
	Set<SanPham> danhSachSPKM;
	
	
	public Set<SanPham> getDanhSachSPKM() {
		return danhSachSPKM;
	}
	public void setDanhSachSPKM(Set<SanPham> danhSachSPKM) {
		this.danhSachSPKM = danhSachSPKM;
	}
	public int getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	public int getMaKM() {
		return maKM;
	}
	public void setMaKM(int maKM) {
		this.maKM = maKM;
	}
	public String getTenKM() {
		return tenKM;
	}
	public void setTenKM(String tenKM) {
		this.tenKM = tenKM;
	}
	public String getThoiGianBatDau() {
		return thoiGianBatDau;
	}
	public void setThoiGianBatDau(String thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}
	public String getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	public void setThoiGianKetThuc(String thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getHinhKhuyenMai() {
		return hinhKhuyenMai;
	}
	public void setHinhKhuyenMai(String hinhKhuyenMai) {
		this.hinhKhuyenMai = hinhKhuyenMai;
	}
	
	public KhuyenMai(int maKM, String tenKM, String thoiGianBatDau, String thoiGianKetThuc, String moTa,
			String hinhKhuyenMai, int giamGia) {
		super();
		this.maKM = maKM;
		this.tenKM = tenKM;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.moTa = moTa;
		this.hinhKhuyenMai = hinhKhuyenMai;
		this.giamGia = giamGia;
	}
	public KhuyenMai() {
		super();
	}
	
	
	
	
}
