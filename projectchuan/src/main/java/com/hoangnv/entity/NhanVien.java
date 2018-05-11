package com.hoangnv.entity;

public class NhanVien {
	private String tenNhanVien;
	private int tuoi;
	public NhanVien() {
		super();
	}
	public NhanVien(String tenNhanVien, int tuoi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

}
