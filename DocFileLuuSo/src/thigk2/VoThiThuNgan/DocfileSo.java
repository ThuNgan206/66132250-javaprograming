package thigk2.VoThiThuNgan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//đọc file bằng scanner sau đó lưu vào arraylist,lấy kí tự X chuyển sang số rồi kiểm tra xem có trong ds ko
public class DocfileSo {
	public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        try {
            File file = new File("songuyen.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextInt()) {
                ds.add(sc.nextInt());
            }
            sc.close();
            System.out.println("Danh sách số nguyên:");
            for (int n : ds) {
                System.out.print(n + " ");
            }
            Scanner input = new Scanner(System.in);
            System.out.print("\nNhập mã sinh viên: ");
            String mssv = input.nextLine();

            char kyTuCuoi = mssv.charAt(mssv.length() - 1);
            int X = Character.getNumericValue(kyTuCuoi);
            if (ds.contains(X)) {
                System.out.println("Có tồn tại X = " + X + " trong danh sách");
            } else {
                System.out.println("Không tồn tại X = " + X);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        }
    }
}
