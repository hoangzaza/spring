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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="SanPham")
public class SanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaSanPham")
	private int maSanPham;
	@Column(name="TenSanPham")
	private String tenSanPham;
	@Column(name="GiaTien")
	private int giaTien;
	@Column(name="MoTa")
	private String moTa;
	@Column(name="HinhSanPham")
	private String hinhSanPham;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MaSanPham")
	Set<ChiTietSanPham> danhSachChiTiet;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ChiTietKhuyenMai",
	joinColumns= {@JoinColumn(name="MaSanPham",referencedColumnName="MaSanPham")},
	inverseJoinColumns= {@JoinColumn(name="MaKM",referencedColumnName="MaKM")})
	Set<KhuyenMai> dsKhuyenMai;
	
	public Set<KhuyenMai> getDsKhuyenMai() {
		return dsKhuyenMai;
	}

	public void setDsKhuyenMai(Set<KhuyenMai> dsKhuyenMai) {
		this.dsKhuyenMai = dsKhuyenMai;
	}

	public Set<ChiTietSanPham> getDanhSachChiTiet() {
		return danhSachChiTiet;
	}

	public void setDanhSachChiTiet(Set<ChiTietSanPham> danhSachChiTiet) {
		this.danhSachChiTiet = danhSachChiTiet;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MaDanhMuc")
	DanhMucSanPham danhMucSanPham;

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhSanPham() {
		return hinhSanPham;
	}

	public void setHinhSanPham(String hinhSanPham) {
		this.hinhSanPham = hinhSanPham;
	}

	public DanhMucSanPham getDanhMucSanPham() {
		return danhMucSanPham;
	}

	public void setDanhMucSanPham(DanhMucSanPham danhMucSanPham) {
		this.danhMucSanPham = danhMucSanPham;
	}

	public SanPham(int maSanPham, String tenSanPham, int giaTien, String moTa, String hinhSanPham,
			DanhMucSanPham danhMucSanPham) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.giaTien = giaTien;
		this.moTa = moTa;
		this.hinhSanPham = hinhSanPham;
		this.danhMucSanPham = danhMucSanPham;
	}

	public SanPham() {
		super();
	}
	
	
	
}
