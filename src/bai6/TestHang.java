package bai6;

import java.time.LocalDate;


public class TestHang {
    public static void main(String[] args) {
        DanhSachHangHoa dshh = new DanhSachHangHoa();

        HangHoa h1 = new HangThucPham("11", "Bánh Quy", 12000.0, 5, "Oshi", LocalDate.of(2024, 1, 22), LocalDate.of(2024, 12, 28));
        HangHoa h2 = new HangThucPham("12", "Bánh Quy Bo", 18000.0, 4, "Orion", LocalDate.of(2024, 5, 12), LocalDate.of(2025, 7, 28));
        HangHoa h4 = new HangDienMay("1110", "Máy Bơm", 50000.0, 15, 2, 280);
        HangHoa h5 = new HangDienMay("1111", "Máy Quạt", 25000.0, 5, 12, 50);
        HangHoa h6 = new HangSanhSu("20", "Chen sứ", 2000.0, 50, "RangDong", LocalDate.of(2024, 5, 5));
        HangHoa h7 = new HangSanhSu("21", "Cốc nước", 12000.0, 120, "ThanTai", LocalDate.of(2024, 6, 1));

        HangHoa h8= new HangThucPham("81", "Sua", 12000.0, 5, "Oshi", LocalDate.of(2024, 8, 22), LocalDate.of(2024, 9, 28));
        dshh.addHang(h1);
        dshh.addHang(h2);
        dshh.addHang(h4);
        dshh.addHang(h5);
        dshh.addHang(h6);
        dshh.addHang(h7);
        
        System.out.println("Danh sách hàng hóa:");
        
        dshh.getDshh().forEach(hh -> System.out.println(hh));
        
//		for (HangHoa h : dshh.getDshh()) {
//			System.out.println(h);
//		}
//		System.out.println("+++++++++++");
//        System.out.println("ds da sx: ");
//        
//		for(HangHoa h: dshh.sortHangTheoMaHang()) {
//			System.out.println(h);
//		}
		
		System.out.println("Danh sach hang sau khi xoa: ");
//		for (HangHoa hh : dshh.XoaHangTheoMaHang("11")) {
//			System.out.println(hh);
//		}
		
		dshh.XoaHangTheoMaHang("11");
		for (HangHoa h : dshh.getDshh()) {
			System.out.println(h);
		}
//		System.out.println("Danh sách hàng hóa sau khi cập nhật:");
//		for(HangHoa hh: dshh.CapNHatHangTheoMaHang("12", h8)) {	
//			System.out.println(hh);
//        }
		System.out.println("Hang hoa co ma 13: ");
		System.out.println(dshh.timKiem("13"));
		
		
//		System.out.println("ds hang sau khi cap nhat: ");
//		for(HangHoa hh: dshh.CapNhatToanBo("12", h8)) {
//			System.out.println(hh);
//        }
		
		System.out.println("ds hang sau khi cap nhat so luong ton: ");
		dshh.capNhatSoLuongTon("12", 10);
		for (HangHoa h : dshh.getDshh()) {
			System.out.println(h);
		}
//		
//		System.out.println("danh sach hang thuc pham kho ban: ");
//		for(HangHoa hh: dshh.hangThucPhamKhoBan()) {
//			System.out.println(hh);
//        }
//		
//		System.out.println("so luong ton giam dan: ");
//		for(HangHoa hh: dshh.sortTheoSLTonGiamDan()) {
//			System.out.println(hh);
//		}
        
    }
}