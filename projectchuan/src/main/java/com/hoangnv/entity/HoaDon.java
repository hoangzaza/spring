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

@Entity(name="HoaDon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaHD")
	private int maHoaDon;
	@Column(name="TenKH")
	private String tenKH;
	@Column(name="SDT")
	private String sDT;
	@Column(name="DiaChi")
	private String diaChi;
	@Column(name="TinhTrang")
	private boolean tinhTrang;
	@Column(name="NgayLap")
	private String ngayLap;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MaHD")
	Set<ChiTietHoaDon> dsChiTietHD;
	
	
	public Set<ChiTietHoaDon> getDsChiTietHD() {
		return dsChiTietHD;
	}
	public void setDsChiTietHD(Set<ChiTietHoaDon> dsChiTietHD) {
		this.dsChiTietHD = dsChiTietHD;
	}
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public String getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}
	public HoaDon(int maHoaDon, String tenKH, String sDT, String diaChi, boolean tinhTrang, String ngayLap) {
		super();
		this.maHoaDon = maHoaDon;
		this.tenKH = tenKH;
		this.sDT = sDT;
		this.diaChi = diaChi;
		this.tinhTrang = tinhTrang;
		this.ngayLap = ngayLap;
	}
	public HoaDon() {
		super();
	}
	
	
	
	

}
