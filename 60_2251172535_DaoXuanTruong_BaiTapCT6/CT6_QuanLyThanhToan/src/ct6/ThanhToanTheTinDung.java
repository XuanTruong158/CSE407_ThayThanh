package ct6;

public class ThanhToanTheTinDung implements IThanhToan {
	@Override
	public void ThanhToan(double soTien) {
		System.out.println("Đã thanh toán bằng thẻ tín dụng: "+ soTien +" VND");
	}
}
