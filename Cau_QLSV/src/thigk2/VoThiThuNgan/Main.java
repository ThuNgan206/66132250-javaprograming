package thigk2.VoThiThuNgan;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.Year;
//tạo lớp sv gồm 3 thuộc tính và 1 thuộc tính tự thêm tạo ArrayList<SinhVien>
//Thêm sẵn 3 sinh viên sau đó in ds
//Nhập thêm 1 sinh viên từ bàn phím thêm vào list in lại danh sách
//tính năm sinh rồi lọc ra sv >20 
public class Main {
		    public static void main(String[] args) {
		        ArrayList<SInhVien> ds = new ArrayList<>();
		        ds.add(new SInhVien("SV01", "Vuu Vinh Tu", 2003, 7.5));
		        ds.add(new SInhVien("SV02", "Lee Jong Suck", 2005, 8.0));
		        ds.add(new SInhVien("SV03", "Ngo Diec Pham", 2002, 6.8));
		        System.out.println("Danh sách sinh viên ban đầu:");
		        for (SInhVien sv : ds) {
		            System.out.println(sv.getMaSV() + " - " + sv.getHoTen() + 
		                               " - " + sv.getNamSinh() + 
		                               " - " + sv.getDiemTB());
		        }
		        Scanner sc = new Scanner(System.in);
		        System.out.println("\nNhập sinh viên mới:");

		        System.out.print("Mã SV: ");
		        String ma = sc.nextLine();

		        System.out.print("Họ tên: ");
		        String ten = sc.nextLine();

		        System.out.print("Năm sinh: ");
		        int nam = Integer.parseInt(sc.nextLine());

		        System.out.print("Điểm TB: ");
		        double diem = Double.parseDouble(sc.nextLine());

		        ds.add(new SInhVien(ma, ten, nam, diem));
		        System.out.println("\nDanh sách sau khi thêm:");
		        for (SInhVien sv : ds) {
		            System.out.println(sv.getMaSV() + " - " + sv.getHoTen() + 
		                               " - " + sv.getNamSinh() + 
		                               " - " + sv.getDiemTB());
		        }
		        int namHienTai = Year.now().getValue();
		        System.out.println("\nSinh viên lớn hơn 20 tuổi:");

		        for (SInhVien sv : ds) {
		            int tuoi = namHienTai - sv.getNamSinh();
		            if (tuoi > 20) {
		                System.out.println(sv.getMaSV() + " - " + sv.getHoTen() + 
		                                   " - Tuổi: " + tuoi);
		            }
		        }
		        sc.close();
		    }
	}
