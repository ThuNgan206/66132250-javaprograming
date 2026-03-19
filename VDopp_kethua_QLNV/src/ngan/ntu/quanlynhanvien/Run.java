package ngan.ntu.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		nhanvien nv1 = new nhanvien("01"," Võ Thị Thu Ngân", 2000000);
		nv1.hienthithongtin();
       System.out.print(nv1.toString());
       nhanvienvanphong nv2=new nhanvienvanphong("002", "Trần Thị Tươi Thắm", 2300000, 3, 200000);
		System.out.print(nv2.toString());
		//nv2.hienThiThongTin();
		Quanly ql = new Quanly("003", "Nguyễn Văn A", 5000000, 1000000, 2.0);
       System.out.println(ql.toString());
       System.out.println(" ");
       //ql.hienThiThongTin();
       ql.hopBanGiamDoc();
       System.out.println(" ");

       // Nhân viên kinh doanh
       nhanvienkinhdoanh kd = new nhanvienkinhdoanh("004", "Lê Văn B", 3000000, 20000000, 5);
       System.out.println(kd.toString());
       //kd.hienThiThongTin();
       kd.chamSocKhachHang();
	}
	}
