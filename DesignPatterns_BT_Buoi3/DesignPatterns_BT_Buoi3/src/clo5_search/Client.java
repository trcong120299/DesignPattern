package clo5_search;

public class Client {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Gạo Thái", "Gạo thơm giống thái");
		Product p2 = new Product(2, "Gạo Nếp", "Gạo nếp hương Song Hương");
		Product p3 = new Product(3, "Gạo Nếp than", "Gạo nếp than Mặt trời");
		
		
		ProductList productList = new ProductList();
		productList.addNew(p1);
		productList.addNew(p2);
		productList.addNew(p3);
		
		//Linear search
		productList.setStrat(new LinearSearch());
		Product x = productList.search(1);
		System.out.println(x);
		
		
		//Binary search
		productList.setStrat(new BinarySearch());
		Product y = productList.search(3);
		System.out.println(y);
		
		
	}
}
