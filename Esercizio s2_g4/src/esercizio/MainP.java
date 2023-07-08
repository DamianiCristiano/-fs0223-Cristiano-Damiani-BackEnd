package esercizio;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainP {

	public static void main(String[] args) {

		Stream<Product> Product = (Stream<Product>) Stream.<Product>builder()

				.add(new Product(1, "pimpa", "Books", 10))

				.add(new Product(2, "achille", "Books", 110))

				.add(new Product(3, "kaka", "Books", 22))

				.add(new Product(4, "ciuccio", "Baby", 4))

				.add(new Product(5, "cappellino", "Boys", 100))

				.build();

		// esercizio 1

//		List<Product> sProduct = Product.filter(ele -> ele.getCategory().equals("Books"))
//				.filter(ele -> ele.getPrice() >= 100).collect(Collectors.toList());
//
//		for (Product ele : sProduct) {
//			System.out.println(ele.id + " " + ele.category + " " + ele.name + " " + ele.price);
//		}

		// esercizio 2
//		List<Product> bProduct = Product.filter(ele -> ele.getCategory().equals("Baby")).collect(Collectors.toList());
//		
//		for (Product ele : bProduct) {
//			System.out.println(ele.id + " " + ele.category + " " + ele.name + " " + ele.price);
//		}

		Customer Cliente1 = new Customer(1, "peppe", 3);
		Customer Cliente2 = new Customer(2, "franco", 2);
//		Order o1 = new Order(1, "shipped", bProduct, Cliente1);
//		System.out.println(o1.deliveryDate);
//	}

		// esercizio 3

		List<Product> bProduct = Product.filter(ele -> ele.getCategory().equals("Boys"))
				.peek(ele -> ele.setPrice(ele.getPrice() * 0.9)).collect(Collectors.toList());

		for (Product ele : bProduct) {
			System.out.println(ele.getPrice());
		}

	}
}
