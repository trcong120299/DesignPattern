package facade;

public class Client {
	public static void main(String[] args) {
		KhachSanFacade.getInstance().nhanPhongKS("21341234", "A001");
		System.out.println("\n");
		KhachSanFacade.getInstance().traPhongKS("21342134", "A001");
	}
}
