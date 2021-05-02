package oopIntro;

public class Product {
	public Product () {
		System.out.println("yazýlým geliþtirme kampý");
	}
	public Product(int id, String name, String egitmen ) {
		this();
		this.id=id;
		this.name= name;
		this.egitmen =egitmen;
		
		
	}
   int id;
   	String name;
   	String egitmen;
}
