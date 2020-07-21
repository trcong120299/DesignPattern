package state;

public class Client {
	public static void main(String[] args) {
		MayGiat mg = new MayGiat();
		
		mg.setTrangThai(new StartState());
		System.out.print("Trạng thái hiện tại của máy giặt là: ");
		mg.applyState();
		
		mg.setTrangThai(new StopState());
		System.out.print("Trạng thái hiện tại của máy giặt là: ");
		mg.applyState();
	}
}
