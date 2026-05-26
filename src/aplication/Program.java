package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter name data ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data:" +product);
		
		System.out.println();
		System.out.print("Enter the numer of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data:" +product);
		
		System.out.println();
		System.out.print("Enter the numer of product to be removed from in stock: ");
	    quantity = sc.nextInt();
		product.removeProduct(quantity);

		System.out.println();
		System.out.println("Updated data:" +product);
		
		sc.close();

	}

}
