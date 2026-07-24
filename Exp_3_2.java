class Vehicle
{
	String brand;
	String model;
	
	Vehicle(String brand, String model)
	{
		this.brand = brand;
		this.model = model;
	}
	
	void display()
	{
		System.out.print("Brand: "+brand+"\tModel: "+model+"\n");
	}
}

class Car extends Vehicle
{
	Car(String brand, String model)
	{
		super(brand,model);
	}
	
	void display()
	{
		super.display();
	}
}

class Bike extends Vehicle
{
	Bike(String brand, String model)
	{
		super(brand,model);
	}
	
	void display()
	{
		super.display();
	}
}

class Exp_3_2
{
	public static void main(String args[])
	{
		Bike b1 = new Bike("RE","Bullet");
		Bike b2 = new Bike("TVS","Jupiter");
		Car c1 = new Car("Tata","Nano");
		Car c2 = new Car("Tata","Safari");
		b1.display();
		b2.display();
		c1.display();
		c2.display();
	}
}