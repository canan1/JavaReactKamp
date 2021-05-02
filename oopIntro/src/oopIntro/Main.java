package oopIntro;

public class Main {

	

	public static void main(String[] args) {
		
		Product product1 = new Product(1, " C# + ANGULAR","ENG�N DEM�RO�") ; //�rnek olu�turma, referans olu�turma, instance
	    product1.id = 1;
		product1.name= "C# + ANGULAR";
		product1.egitmen= "ENG�N DEM�RO�";
		//�r�n nesnesi olu�turdum
		
		Product product2 = new Product() ;
		product2.id = 0;
		product2.name= "JAVA + REACT";
		product2.egitmen= "ENG�N DEM�RO�";
		
		Product product3 = new Product() ;
		product3.id = 6;
		product3.name= "PROGRAMLAMAYA G�R�� ���N TEMEL KURS";
		product3.egitmen= "ENG�N DEM�RO�";
		
		Product[] products = {product1, product2, product3};
		for (Product product : products) 
		{
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
        Category category1 = new Category ();
        category1.id= 1;
        category1.name= "�DEVLER" ;
        Category category2 = new Category ();
        category2.id= 2;
        category2.name= "PROGRAM" ;
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
	}

}
