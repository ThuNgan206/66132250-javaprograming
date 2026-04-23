package thigk2.VoThiThuNgan;

public class SInhVien {
	    private String maSV;
	    private String hoTen;
	    private int namSinh;
	    private double diemTB;
	    public SInhVien(String maSV, String hoTen, int namSinh, double diemTB) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.namSinh = namSinh;
	        this.diemTB = diemTB;
	    }
	    public String getMaSV() {
	        return maSV;
	    }

	    public void setMaSV(String maSV) {
	        this.maSV = maSV;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public int getNamSinh() {
	        return namSinh;
	    }

	    public void setNamSinh(int namSinh) {
	        this.namSinh = namSinh;
	    }

	    public double getDiemTB() {
	        return diemTB;
	    }

	    public void setDiemTB(double diemTB) {
	        this.diemTB = diemTB;
	    }
	}

