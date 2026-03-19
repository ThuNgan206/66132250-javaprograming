package ngan.ntu.quanlynhanvien;

public class nhanvien {
	private String maNV;
	private String hoTen;
	private double luongcoban;
//	public nhanvien() {
//	}
 // public nhanvien(String manhanvien, String tennhanvien, double luongcoban) {
   // 	this.maNV = manhanvien;
    //	this.hoTen = tennhanvien;
    //	this.luongcoban = luongcoban;	
   // }
    public nhanvien( String maNV, String hoTen, double luongcoban) {
    	super();
    	this.maNV = maNV;
    	this.hoTen = hoTen;
    	this.luongcoban = luongcoban;
    }
    public nhanvien() {
    	super();
    }
    public double tinhluong() {
    	return luongcoban;
    }
	@Override
	public String toString() {
		String chuoiXuat="";
		chuoiXuat = chuoiXuat + "Mã NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHọ tên: " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLương cơ bản: " + this.luongcoban;
		return chuoiXuat;
//		return "nhanvien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongcoban=" + luongcoban + "]";
	}
	public void hienthithongtin() {
		System.out.println("ma nv:"+maNV);
		System.out.println("ho ten :"+hoTen);
		System.out.println("luong co ban :"+luongcoban);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getluongcoban() {
		return luongcoban;
	}
	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
    
}
