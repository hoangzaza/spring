package com.hoangnv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="MauSanPham")
public class MauSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaMau")
	private int maMau;
	@Column(name="MauSanPham")
	private String mauSanPham;
	public int getMaMau() {
		return maMau;
	}
	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}
	public String getMauSanPham() {
		return mauSanPham;
	}
	public void setMauSanPham(String mauSanPham) {
		this.mauSanPham = mauSanPham;
	}
	public MauSanPham(int maMau, String mauSanPham) {
		super();
		this.maMau = maMau;
		this.mauSanPham = mauSanPham;
	}
	public MauSanPham() {
		super();
	}
	
	

}
