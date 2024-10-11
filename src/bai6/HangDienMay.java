package bai6;

public class HangDienMay extends HangHoa {

    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 1;
        this.congSuat = 1.0;
    }

    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon,
                       int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, donGia, soLuongTon);
        setThoiGianBaoHanh(thoiGianBaoHanh);
        setCongSuat(congSuat);
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        if (thoiGianBaoHanh < 0) {
            throw new IllegalArgumentException("Thời gian bảo hành phải >= 0 tháng");
        }
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        if (congSuat < 0) {
            throw new IllegalArgumentException("Công suất phải >= 0 KW");
        }
        this.congSuat = congSuat;
    }

//    @Override
//    public String toString() {
//        return String.format("%-5s%-25s%-8.2f%7d%-5d%.2f", 
//            getMaHang(), getTenHang(), getDonGia(), getSoLuongTon(), 
//            thoiGianBaoHanh, congSuat);
//    }

	@Override
	public String danhGiaMucDoBanBuon() {
		return soLuongTon <3 ? "Ban duoc": "";
	}

	@Override
	public double tinhTienVAT() {
		// TODO Auto-generated method stub
		return donGia*0.1;
	}
}