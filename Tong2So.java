import java.util.Scanner;
public class Tong2So {

	public static void main(String[] args) {
//Khai báo 
		double num1, num2, sum;
//Khai báo đối tượng scanner
		Scanner Nhap = new Scanner(System.in);
//In kết quả
		System.out.print("Nhập số thứ nhất: ");
		   num1 = Nhap.nextDouble();
		System.out.print("Nhập số thứ hai: ");
		   num2 = Nhap.nextDouble();
//Tính toán
		   sum = num1 + num2;
//Xuất kết quả
		   System.out.printf("Tổng của %.2f + %.2f là: %.2f", num1, num2, sum);
//Đóng scanner
		   Nhap.close();
	}

}
