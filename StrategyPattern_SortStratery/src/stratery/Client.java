package stratery;

public class Client {
	public static void main(String[] args) {
		SortList s = new SortList();
		
		s.addNew("ABC");
		s.addNew("DEF");
		s.addNew("XYZ");
		
		s.setiSort(new MergeSort());
		s.sort();
		
		s.setiSort(new QuickSort());
		s.sort();
		
	}
}
