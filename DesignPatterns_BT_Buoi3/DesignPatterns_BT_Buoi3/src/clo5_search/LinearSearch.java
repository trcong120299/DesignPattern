package clo5_search;

import java.util.List;

public class LinearSearch implements ISearchStrategy{

	@Override
	public Product search(int productID, List<Product> list) {
		for(Product p : list) {
			if(p.getProductID()==productID)
				return p;
		}
		return null;
	}

}
