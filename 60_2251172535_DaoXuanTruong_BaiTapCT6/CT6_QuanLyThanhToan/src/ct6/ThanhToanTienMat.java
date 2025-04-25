package ct6;

public class ThanhToanTienMat implements IThanhToan {
	@Override
	public void ThanhToan(double soTien) {
		System.out.println("Đã thanh toán bằng tiền mặt: " + soTien + " VND");
	};
}
