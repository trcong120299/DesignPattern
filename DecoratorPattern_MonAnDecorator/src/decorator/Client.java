package decorator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		HoaDon hd = new HoaDon("123", LocalDate.now(), null);
		List<IMon> dsMon = new ArrayList<IMon>();
		IMon mon = new CheHatSen();
		
		IChe che = (IChe) new CotDua((IChe) mon);
		
		mon = new CotDua((IChe) che);
		mon = new PhoMai((IChe) che);
		dsMon.add(mon);
		hd.setDsMon(dsMon);
		hd.display();
	}
}
