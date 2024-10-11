package bai6;

import java.text.DecimalFormat;

public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	
	public HangHoa() {
		this("", "xxx", 1.0, 2);
	}

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if(maHang== null) {
			throw new IllegalArgumentException("ma hang khong duoc null");
		}
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(tenHang==null) {
			this.tenHang= "xxx";
		}
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if(donGia< 0) {
			throw new IllegalArgumentException("don gia >=0");
		}
		this.donGia = donGia;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon< 0) {
			throw new IllegalArgumentException("so luong ton >=0");
		}
		this.soLuongTon = soLuongTon;
	}
	
	public abstract String danhGiaMucDoBanBuon();
	public abstract double tinhTienVAT();
	
		
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00VNĐ");
		return String.format("%-5s%-25s%-5.2f%6d%20s%10s", maHang, tenHang, donGia, soLuongTon, danhGiaMucDoBanBuon(), df.format(tinhTienVAT()));
	}

}
