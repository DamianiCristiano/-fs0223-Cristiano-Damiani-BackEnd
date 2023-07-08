package esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {

	long id;
	String status;
	LocalDate orderDate = LocalDate.now();
	LocalDate deliveryDate;
	LocalDate DeliveryDate = orderDate.plusDays(7);
	Customer customer;
	List<Product> products;

	public Order(long id, String status, List<Product> products, Customer customer) {

		this.id = id;
		this.status = status;
		this.products = products;
		this.customer = customer;
		this.orderDate = LocalDate.now();
		this.deliveryDate = DeliveryDate;

	}

}
