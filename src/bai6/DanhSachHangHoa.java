package bai6;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Arrays;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> dshh;
	
	public DanhSachHangHoa() {
		dshh = new ArrayList<HangHoa>();
	}
	
	public boolean addHang(HangHoa hang) {
		if (hang == null) {
			return false;
		}
		for (HangHoa h : dshh) {
			if (h.getMaHang().equalsIgnoreCase(hang.getMaHang())) {
				return false;
			}
		}
		dshh.add(hang);
		return true;
	}
    
	public List<HangHoa> getDshh() {
		return dshh;
	}
	
//	public List<HangHoa> timHangHoaTheoTen(String ten) {
//		List<HangHoa> ds = new ArrayList<HangHoa>();
//		for (HangHoa h : dshh) {
//			if (h.getTenHang().toLowerCase().contains(ten.toLowerCase())) {
//				ds.add(h);
//			}
//		}
//		return ds;
//	}
	
	public HangHoa timHangTheoTen(String ten) {
		for(HangHoa h: dshh) {
			if(h.getTenHang().toLowerCase().contains(ten.toLowerCase())) {
				return h;
			}
		}
		return null;
	}
//	public HangHoa timKiemTheoMaHang(String maHang) {
//		for (HangHoa h : dshh) {
//			if (h.getMaHang().equalsIgnoreCase(maHang)) {
//				return h;
//			}
//		}
//		return null;
//	}
	
	public HangHoa timKiem(String maHang) {
		return dshh.stream()
				.filter(h -> h.getMaHang().equalsIgnoreCase(maHang))
				.findFirst()
				.orElse(null);
	}
	public List<HangHoa> sortHangTheoMaHang(){
		List<HangHoa> ds = new ArrayList<HangHoa> (dshh) ;
		ds.sort((h1, h2) -> {
			return h2.getMaHang().compareTo(h1.getMaHang()); // sort desc
		});
		return ds;

		
//		ds.sort((h1, h2) -> {
//			return h1.getMaHang().compareTo(h2.getMaHang());
//        });
//	    return ds.toArray(new HangHoa[0]); 
        
    }
	
//	public List<HangHoa> XoaHangTheoMaHang(String maHang) {
//		List<HangHoa> ds = new ArrayList<HangHoa>(dshh);
//		for (HangHoa h : dshh) {
//			if (h.getMaHang().equalsIgnoreCase(maHang)) {
//				ds.remove(h);
//			}
//		}
//		return ds;
//	}
	
	public boolean XoaHangTheoMaHang(String maHang) {
		Iterator<HangHoa> it = dshh.iterator();
		while (it.hasNext()) {
			HangHoa h = it.next();
			if (h.getMaHang().equalsIgnoreCase(maHang)) {
				it.remove();
				return true;
			}
		}
		return false;
	    
	}

	
	
//	public List<HangHoa> CapNHatHangTheoMaHang(String maHang, HangHoa hang) {
//		List<HangHoa> ds = new ArrayList<HangHoa>(dshh);
//		for (HangHoa h : dshh) {
//			if (h.getMaHang().equalsIgnoreCase(maHang)) {
//				ds.set(ds.indexOf(h), hang);
//			}
//		}
//		return ds;
//	}
	
	public List<HangHoa> CapNhatToanBo(String maHang, HangHoa hang){
		for(int i=0;i< dshh.size();i++) {
			if (dshh.get(i).getMaHang().equalsIgnoreCase(maHang)) {
				dshh.set(i, hang);
			}
		}
		return dshh;
	}
	
	public HangHoa capNhatSoLuongTon(String maHang, int soLuongTonMoi) {
		HangHoa h = timKiem(maHang);
		if (h != null) {
			h.setSoLuongTon(soLuongTonMoi);
		}
		return h;
	}
	public List<HangHoa> hangThucPhamKhoBan(){
		List<HangHoa> ds= new ArrayList<HangHoa>();
		for (HangHoa h : dshh) {
			if (h instanceof HangThucPham) {
				HangThucPham htp = (HangThucPham) h;
				if (htp.danhGiaMucDoBanBuon().equalsIgnoreCase("Kho ban")) {
					ds.add(htp);
				}
			}
		}
		return ds;
	}
	
	public List<HangHoa> sortTheoSLTonGiamDan(){
		List<HangHoa> ds = new ArrayList<HangHoa>(dshh);
        ds.sort((h1, h2) -> {
            return h2.getSoLuongTon() - h1.getSoLuongTon();
        });
        return ds;
    }
}


