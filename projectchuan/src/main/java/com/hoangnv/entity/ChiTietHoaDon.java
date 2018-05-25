package com.hoangnv.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="ChiTietHoaDon")
public class ChiTietHoaDon {
	
	@EmbeddedId
	ChiTietHoaDonid id;
	@Column(name="SoLuong")
	private int soLuong;
	@Column(name="GiaTien")
	private int giaTien;
	
}
