package oopIntro;

public class Product {
	public Product () {
		System.out.println("yaz�l�m geli�tirme kamp�");
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
