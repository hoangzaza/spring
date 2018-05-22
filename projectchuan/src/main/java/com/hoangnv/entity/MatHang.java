package com.hoangnv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MatHang")
//tên bảng trong csdl
public class MatHang {
	
	//nếu đặt tên thuộc tính giống tên trường trong csdl thì không cần column
	@Id
	@Column(name="idMatHang")
	private String idMatHang;
	@Column(name="TenMatHang")
	private String tenMatHang;
	@Column(name="Gia")
	private int gia;
	@Column(name="MoTa")
	private String moTa;
	public String getIdMatHang() {
		return idMatHang;
	}
	public void setIdMatHang(String idMatHang) {
		this.idMatHang = idMatHang;
	}
	public String getTenMatHang() {
		return tenMatHang;
	}
	public void setTenMatHang(String tenMatHang) {
		this.tenMatHang = tenMatHang;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public MatHang(String idMatHang, String tenMatHang, int gia, String moTa) {
		super();
		this.idMatHang = idMatHang;
		this.tenMatHang = tenMatHang;
		this.gia = gia;
		this.moTa = moTa;
	}
	public MatHang() {
		super();
	}
	

}
