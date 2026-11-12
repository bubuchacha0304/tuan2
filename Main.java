package BAI2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SinhVien sv1 = new SinhVien(
	            1001,
	            "Nguyen Van A",
	            8.5,
	            9.0
	        );
	     SinhVien sv2 = new SinhVien(
	            1002,
	            "Tran Thi B",
	            7.5,
	            8.0
	        );
		SinhVien sv3= new SinhVien();
		System.out.println("Nhap thong tin sinh vien :");
		
		System.out.println("ma sinh vien :");
		sv3.setMaSinhVien(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Ho ten: ");
		sv3.setHoTen(sc.nextLine());
		
		System.out.println("Diem LT: ");
		sv3.setDiemLT(sc.nextDouble());
		
		System.out.println("Diem TH: ");
		sv3.setDiemTH(sc.nextDouble());
		
		
		System.out.println("\nDanh Sach Sinh Vien");
		System.out.printf("%-15s %-25s %-10s %-10s %-10s%n",
	            "MSSV", "Ho ten", "Diem LT", "Diem TH", "Diem TB"
	            );
		System.out.println(sv1);
        System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}
