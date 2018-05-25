package com.hoangnv.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="DanhMucSanPham")
public class DanhMucSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaDanhMuc")
	private int maDanhMuc;
	@Column(name="TenDanhMuc")
	private String tenDanhMuc;
	@Column(name="HinhDanhMuc")
	private String hinhDanhMuc;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MaDanhMuc")
	private Set<SanPham> danhSachSP;
	public Set<SanPham> getDanhSachSP() {
		return danhSachSP;
	}
	public void setDanhSachSP(Set<SanPham> danhSachSP) {
		this.danhSachSP = danhSachSP;
	}
	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getHinhDanhMuc() {
		return hinhDanhMuc;
	}
	public void setHinhDanhMuc(String hinhDanhMuc) {
		this.hinhDanhMuc = hinhDanhMuc;
	}
	public DanhMucSanPham(int maDanhMuc, String tenDanhMuc, String hinhDanhMuc) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		this.hinhDanhMuc = hinhDanhMuc;
	}
	public DanhMucSanPham() {
		super();
	}
	
	
	
	

}
