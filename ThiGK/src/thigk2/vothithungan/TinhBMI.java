package thigk2.vothithungan;

import java.util.Scanner;
//nhập cân nặng và chiều cao sau đó tính chỉ số BMI theo công thức BMI= cân nặng/chiều cao* chiều cao
//sau đó xuất kết quả
public class TinhBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập chiều cao (cm): ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        double canNang = sc.nextDouble();

        // Tính BMI
        double bmi = canNang / (chieuCao * chieuCao);

        // Xuất BMI
        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        // Phân loại
        if (bmi < 18.5) {
            System.out.println("Tình trạng: Gầy");
        } else if (bmi < 25) {
            System.out.println("Tình trạng: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Tình trạng: Thừa cân");
        } else {
            System.out.println("Tình trạng: Béo phì");
        }

        sc.close();
    }
}

