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
	private String tenMau;
	public int getMaMau() {
		return maMau;
	}
	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}
	
	public MauSanPham(int maMau, String tenMau) {
		super();
		this.maMau = maMau;
		this.tenMau = tenMau;
	}
	public String getTenMau() {
		return tenMau;
	}
	public void setTenMau(String tenMau) {
		this.tenMau = tenMau;
	}
	public MauSanPham() {
		super();
	}
	
	

}
