package clo5_search;

import java.util.List;

public interface ISearchStrategy {
	public Product search(int productID, List<Product> list);
}
