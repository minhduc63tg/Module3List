package bai6;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;

    public HangSanhSu() {
        super();
        this.nhaSanXuat = "";
        this.ngayNhapKho = LocalDate.now();
    }

    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, 
                      String nhaSanXuat, LocalDate ngayNhapKho) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaSanXuat = nhaSanXuat;
        setNgayNhapKho(ngayNhapKho); 
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        if (ngayNhapKho.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngày nhập kho không được sau ngày hiện tại");
        }
        this.ngayNhapKho = ngayNhapKho;
    }

//    @Override
//    public String toString() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        return String.format("%-5s%-25s%-8.2f%-7d%-25s%15s", 
//                             maHang, tenHang, donGia, soLuongTon, 
//                             nhaSanXuat, ngayNhapKho.format(formatter));
//    }

	@Override
	public String danhGiaMucDoBanBuon() {
		int thoiGianLuuKho= LocalDate.now().getYear()-ngayNhapKho.getYear();
		return (thoiGianLuuKho >10 && soLuongTon >50 )? "Ban cham": "";
		
	}

	@Override
	public double tinhTienVAT() {
		return donGia * 0.1;
	}
}
