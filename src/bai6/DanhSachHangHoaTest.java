package bai6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DanhSachHangHoaTest {
    private DanhSachHangHoa dshh;

    @BeforeEach
    void setup() {
        dshh = new DanhSachHangHoa();  // Khởi tạo đối tượng dshh
        dshh.addHang(new HangThucPham("11", "Bánh Quy", 12000.0, 5, "Oshi", LocalDate.of(2024, 1, 22), LocalDate.of(2024, 12, 28)));
        dshh.addHang(new HangThucPham("12", "Bánh Quy Bo", 18000.0, 4, "Orion", LocalDate.of(2024, 5, 12), LocalDate.of(2025, 7, 28)));
        dshh.addHang(new HangDienMay("1110", "Máy Bơm", 50000.0, 15, 2, 280));
        dshh.addHang(new HangDienMay("1111", "Máy Quạt", 25000.0, 5, 12, 50));
        dshh.addHang(new HangSanhSu("20", "Chen sứ", 2000.0, 50, "RangDong", LocalDate.of(2024, 5, 5)));
    }

    @Test
    void timKiem() {
        HangHoa hh = dshh.timKiem("12");
        assertEquals("12", hh.getMaHang());
    }

    @Test
    void timKiemNull() {
        HangHoa hh = dshh.timKiem("9999");  // Sử dụng mã không tồn tại
        assertNull(hh);
    }

//    @Test
//    void timHangHoaTheoTen() {
//        assertEquals(2, dshh.timHangHoaTheoTen("Bánh").size());
//    }
    
    
    @Test
    void timHangTheoTen() {
    	HangHoa hh= dshh.timHangTheoTen("Bánh Quy");
    	assertEquals("Bánh Quy", hh.getTenHang());
    }
    @Test
	void CapNhatToanBo() {
		HangHoa h8 = new HangThucPham("81", "Sua", 12000.0, 5, "Oshi", LocalDate.of(2024, 8, 22),
				LocalDate.of(2024, 9, 28));
		assertEquals(5, dshh.CapNhatToanBo("12", h8).size());
	}
    
//    @Test
//    void capNhatSoLuongTon() {
//    	HangHoa hh = dshh.capNhatSoLuongTon("12", 10);
//    	assertEquals(10, hh.getSoLuongTon());
//    }
//    
    
}
