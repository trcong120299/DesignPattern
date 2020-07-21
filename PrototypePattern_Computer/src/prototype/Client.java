package prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		 Computer computer1 = new Computer("Window 10", "Word 2013", "BKAV", "Chrome v69", "Skype");
	     Computer computer2 = (Computer) computer1.clone();
	     computer2.setOthers("Skype, Teamviewer, FileZilla Client");
	 
	     System.out.println(computer1);
	     System.out.println(computer2);
	}
}
