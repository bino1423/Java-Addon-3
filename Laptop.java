package programs;

public class Laptop {

	String model;
	int ram;
	int storage;
	
	public Laptop(String model,int ram,int storage) {
		this.model=model;
		this.ram=ram;
		this.storage=storage;
	}
	
	void Display() {
		System.out.println("Laptop model: "+model+"\nLaptop ram: "+ram+"GB"+"\nLaptop Storage: "+storage+"GB");
	}

	public static void main(String[] args) { 
		Laptop l=new Laptop("Asus",8,512);
		l.Display();
	}
}

