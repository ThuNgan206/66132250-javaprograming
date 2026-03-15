package ngan.ntu.zuzu;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer>DSsonguyen = new ArrayList<Integer>();
        Scanner banphim = new Scanner(System.in);
        for(int i=0; i<10; i++) {
        System.out.print("Nhap phan tu thu "+ i +":");
        Integer tam = banphim.nextInt();
        DSsonguyen.add(tam);
	}
        for(Integer x:DSsonguyen) {
        	System.out.print(x +" ");
        }
        int soptuchan = 0;
        for(Integer x : DSsonguyen) {
        	if (x % 2 ==0) soptuchan=soptuchan+1;
        }
        System.out.println("so phan tu chan la:"+soptuchan);
        int tong =0;
    	for(Integer x: DSsonguyen) {
    		tong =tong +x;
    	}
    	System.out.println("tong tat ca cac phan tu la :"+tong);
  }
}
