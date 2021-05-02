package oopIntro;

public class Main {

	

	public static void main(String[] args) {
		
		Product product1 = new Product(1, " C# + ANGULAR","ENGÝN DEMÝROÐ") ; //örnek oluþturma, referans oluþturma, instance
	    product1.id = 1;
		product1.name= "C# + ANGULAR";
		product1.egitmen= "ENGÝN DEMÝROÐ";
		//ürün nesnesi oluþturdum
		
		Product product2 = new Product() ;
		product2.id = 0;
		product2.name= "JAVA + REACT";
		product2.egitmen= "ENGÝN DEMÝROÐ";
		
		Product product3 = new Product() ;
		product3.id = 6;
		product3.name= "PROGRAMLAMAYA GÝRÝÞ ÝÇÝN TEMEL KURS";
		product3.egitmen= "ENGÝN DEMÝROÐ";
		
		Product[] products = {product1, product2, product3};
		for (Product product : products) 
		{
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
        Category category1 = new Category ();
        category1.id= 1;
        category1.name= "öDEVLER" ;
        Category category2 = new Category ();
        category2.id= 2;
        category2.name= "PROGRAM" ;
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
	}

}
