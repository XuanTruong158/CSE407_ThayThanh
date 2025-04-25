package ct6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		IThanhToan ttTienMat = new ThanhToanTienMat();
		System.out.print("Thanh toán tiền mặt: ");
		double soTienMat = scanner.nextDouble();
		ttTienMat.ThanhToan(soTienMat);
		
		
		IThanhToan ttTheTinDung = new ThanhToanTheTinDung();
		System.out.print("Thanh toán thẻ tín dụng: ");
		double soTienThe = scanner.nextDouble();
		ttTheTinDung.ThanhToan(soTienThe);
		
		scanner.close();
	}

}
