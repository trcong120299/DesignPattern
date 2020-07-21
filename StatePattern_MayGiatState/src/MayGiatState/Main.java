package MayGiatState;

public class Main {
	public static void main(String[] args) {
		Maygiat mg = new Maygiat();
//		mg.start();
//		mg.stop();
//		mg.start();
//		mg.pause();
//		mg.pause();
		
		System.out.print("Trạng thái hiện tại của máy giặt là: ");
		mg.getCurState().start();
	}
}
