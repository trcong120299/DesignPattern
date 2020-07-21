package clo5_search;

import java.util.List;

public class BinarySearch implements ISearchStrategy{

	@Override
	public Product search(int productID, List<Product> list) {
		return bSearch(productID, list, 0, list.size());
	}

	public Product bSearch(int productID, List<Product> list, int left, int right) {
		if(left>=right)
			return null;
		
		int mid=(left+right)/2;
		Product p = list.get(mid);
		if(p.getProductID() == productID)
			return p;
		if(p.getProductID() > productID)
			return bSearch(productID, list, left, mid-1);
		else
			return bSearch(productID,list, mid+1, right);
	}
	
}
