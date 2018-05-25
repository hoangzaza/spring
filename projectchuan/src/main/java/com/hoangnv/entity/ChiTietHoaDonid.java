package com.hoangnv.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonid implements Serializable{

	@Column(name="MaHD")
	private int maHD;
	@Column(name="MaCTSP")
	private int maCTSP;
	public int getMaHD() {
		return maHD;
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	public int getMaCTSP() {
		return maCTSP;
	}
	public void setMaCTSP(int maCTSP) {
		this.maCTSP = maCTSP;
	}
	public ChiTietHoaDonid(int maHD, int maCTSP) {
		super();
		this.maHD = maHD;
		this.maCTSP = maCTSP;
	}
	public ChiTietHoaDonid() {
		super();
	}
	
}
