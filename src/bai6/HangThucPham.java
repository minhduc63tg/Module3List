package bai6;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private String nhaCungCap;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;


    public HangThucPham() {
        super();
        this.nhaCungCap = "";
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = ngaySanXuat; 
    }

 
    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, 
                        String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaCungCap = nhaCungCap;
        setNgaySanXuat(ngaySanXuat); 
        setNgayHetHan(ngayHetHan); 
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngày sản xuất không được sau ngày hiện tại");
        }
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isBefore(ngaySanXuat)) {
            throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất");
        }
        this.ngayHetHan = ngayHetHan;
    }

//    @Override
//    public String toString() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        return String.format("%-5s%-25s%-8.2f%-7d%-25s%15s%15s", 
//                             maHang, tenHang, donGia, soLuongTon, 
//                             nhaCungCap, ngaySanXuat.format(formatter), 
//                             ngayHetHan.format(formatter));
//    }


	@Override
	public String danhGiaMucDoBanBuon() {
		// TODO Auto-generated method stub
		return (soLuongTon >0 && ngayHetHan.isBefore(LocalDate.now())) ? "Kho ban": "";
	}


	@Override
	public double tinhTienVAT() {
		
		return donGia* 0.05;
	}
}
