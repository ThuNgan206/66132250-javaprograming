package ngan.ntu.quanlynhanvien;

public class nhanvienvanphong  extends nhanvien{
	private double sogiolamthem;
	private double luongthemmoigio;
	public nhanvienvanphong(String maNV, String hoTen,double luongcoban ,double sogio,double luonggio) {
		super(maNV,hoTen,luongcoban);
		sogiolamthem=sogio;
		luongthemmoigio=luonggio;
	}
	@Override
	public double tinhluong() {
		return super.getluongcoban()+sogiolamthem*luongthemmoigio;
	}
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("Số giờ làm thêm : " + sogiolamthem);
        System.out.println("Lương cho mỗi giờ làm thêm : " + luongthemmoigio);
        System.out.println("Lương được nhận: " + tinhluong());
	}
	
	@Override
	public String toString() {
		String chuoiXuat=super.toString();
		chuoiXuat = chuoiXuat + "\nSố giờ làm thêm : " + sogiolamthem;
		chuoiXuat = chuoiXuat + "\nLương cho mỗi giờ làm thêm : " + luongthemmoigio;
		chuoiXuat = chuoiXuat + "\nLương được nhận: " + tinhluong();
		return chuoiXuat;
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
}
