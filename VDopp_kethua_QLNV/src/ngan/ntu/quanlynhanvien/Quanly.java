package ngan.ntu.quanlynhanvien;

public class Quanly extends nhanvien{
	private double phuCapChucVu;
    private double heSoKinhNghiem;
    
    public Quanly(String maNV, String hoTen, double luongcoban, double phuCapChucVu, double heSoKinhNghiem) {
        super(maNV, hoTen, luongcoban);
        this.phuCapChucVu = phuCapChucVu;
        this.heSoKinhNghiem = heSoKinhNghiem;
    }
    
    @Override
    public double tinhluong() {
        return (getluongcoban() * heSoKinhNghiem) + phuCapChucVu;
    }
    
    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
        System.out.println("Hệ số kinh nghiệm: " + heSoKinhNghiem);
        System.out.println("Tổng lương: " + this.tinhluong());
        System.out.println("Chức vụ: Quản lý");
    }
    public void hopBanGiamDoc() {
        System.out.println(getHoTen() + " đang họp với ban giám đốc...");
}
}
