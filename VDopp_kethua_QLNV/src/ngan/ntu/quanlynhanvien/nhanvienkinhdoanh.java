package ngan.ntu.quanlynhanvien;

public class nhanvienkinhdoanh extends nhanvien {
	private double doanhSo;
    private double tyLeHoaHong;
    
    public nhanvienkinhdoanh(String maNV, String hoTen, double luongcoban,double doanhSo, double tyLeHoaHong) {
        super(maNV, hoTen, luongcoban);
        this.doanhSo = doanhSo;
        this.tyLeHoaHong = tyLeHoaHong;
    }
    
    @Override
    public double tinhluong() {
        return getluongcoban() + (doanhSo * tyLeHoaHong / 100);
    }
    
    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("Doanh số: " + doanhSo);
        System.out.println("Tỷ lệ hoa hồng: " + tyLeHoaHong);
        System.out.println("Tổng lương: " + this.tinhluong());
        System.out.println("Chức vụ: Nhân viên kinh doanh");
    }
    
    public void chamSocKhachHang() {
        System.out.println(getHoTen() + " đang chăm sóc khách hàng...");
}
}
