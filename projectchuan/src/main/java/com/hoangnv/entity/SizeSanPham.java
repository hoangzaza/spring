package com.hoangnv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="SizeSanPham")
public class SizeSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaSize")
	private int maSize;
	@Column(name="TenSize")
	private String tenSize;
	public SizeSanPham(int maSize, String tenSize) {
		super();
		this.maSize = maSize;
		this.tenSize = tenSize;
	}
	public SizeSanPham() {
		super();
	}
	public int getMaSize() {
		return maSize;
	}
	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}
	public String getTenSize() {
		return tenSize;
	}
	public void setTenSize(String tenSize) {
		this.tenSize = tenSize;
	}
	
	

}
