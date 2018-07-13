package com.hoangnv.entity;

public class ChiTietGioHang {
	public ChiTietGioHang() {
		super();
	}
	public ChiTietGioHang(int masp, int maMau, int maSize, int soLuong) {
		super();
		this.masp = masp;
		this.maMau = maMau;
		this.maSize = maSize;
		this.soLuong = soLuong;
	}
	private int masp;
	private int maMau;
	private int maSize;
	private int soLuong;
	public int getMasp() {
		return masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}
	public int getMaMau() {
		return maMau;
	}
	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}
	public int getMaSize() {
		return maSize;
	}
	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}
