package com.hoangnv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ChucVu")
public class ChucVu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaChucVu")
	private int maChucVu;
	@Column(name="TenChucVu")
	private String tenChucVu;
	public int getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(int maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	public ChucVu(int maChucVu, String tenChucVu) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
	}
	public ChucVu() {
		super();
	}
	
	
}
