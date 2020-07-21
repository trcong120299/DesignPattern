package clo5_search;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	private List<Product> list;
	private ISearchStrategy strat;
	
	public ProductList() {
		list = new ArrayList<>();
	}
	
	public void addNew(Product p) {
		list.add(p);
	}
	
	public void deleteOne(Product p) {
		list.remove(p);
	}
	
	public Product getProduct(int i) {
		if(i>=0 && i<list.size())
			return list.get(i);
		return null;
	}

	public Product search(int productID) {
		return strat.search(productID, this.getList());
	}
	
	/**
	 * @return the strat
	 */
	public ISearchStrategy getStrat() {
		return strat;
	}

	/**
	 * @param strat the strat to set
	 */
	public void setStrat(ISearchStrategy strat) {
		this.strat = strat;
	}

	/**
	 * @return the list
	 */
	public List<Product> getList() {
		return list;
	}
	
}
