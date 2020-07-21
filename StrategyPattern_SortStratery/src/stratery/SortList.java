package stratery;

import java.util.ArrayList;
import java.util.List;

public class SortList {
	private ISort iSort;
	private List<String> items;
	
	public SortList() {
		// TODO Auto-generated constructor stub
		items = new ArrayList<String>();
	}
	
	public void addNew(String item) {
		items.add(item);
	}
	
	public void sort() {
		iSort.sort(items);
	}

	public ISort getiSort() {
		return iSort;
	}

	public void setiSort(ISort iSort) {
		this.iSort = iSort;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	
	
}
