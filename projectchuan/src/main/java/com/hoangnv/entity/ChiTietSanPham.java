package com.hoangnv.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="ChiTietSanPham")
public class ChiTietSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaCTSP")
	private int maCTSP;
	@Column(name="SoLuong")
	private int soLuong;
	@Column(name="NgayNhap")
	private String ngayNhap;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MaSanPham")
	SanPham sanPham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MaMau")
	MauSanPham mauSanPham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MaSize")
	SizeSanPham sizeSanPham;

	public int getMaCTSP() {
		return maCTSP;
	}

	public void setMaCTSP(int maCTSP) {
		this.maCTSP = maCTSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public MauSanPham getMauSanPham() {
		return mauSanPham;
	}

	public void setMauSanPham(MauSanPham mauSanPham) {
		this.mauSanPham = mauSanPham;
	}

	public SizeSanPham getSizeSanPham() {
		return sizeSanPham;
	}

	public void setSizeSanPham(SizeSanPham sizeSanPham) {
		this.sizeSanPham = sizeSanPham;
	}

	public ChiTietSanPham(int maCTSP, int soLuong, String ngayNhap, SanPham sanPham, MauSanPham mauSanPham,
			SizeSanPham sizeSanPham) {
		super();
		this.maCTSP = maCTSP;
		this.soLuong = soLuong;
		this.ngayNhap = ngayNhap;
		this.sanPham = sanPham;
		this.mauSanPham = mauSanPham;
		this.sizeSanPham = sizeSanPham;
	}

	public ChiTietSanPham() {
		super();
	}

	
	
	
}
