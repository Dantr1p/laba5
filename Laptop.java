package laptop;
import java.util.Scanner;
public class Laptop()
{
	private String model;
	private int RAM_size;
	private int CPU_frequency;
	private double price;
	private int year;
	public Laptop 
	{
		this.model="no_name";
		this.RAM_size=0;
		this.CPU_frequency=0;
		this.price=0;
		this.year=0;
	}
	public Laptop(String model, int RAM_size, int CPU_frequency, double price, int year)
	{
		this.model=model;
		this.RAM_size=RAM_size;
		this.CPU_frequency=CPU_frequency;
		this.price=price;
		this.year=year;
	}
	public void set_model(String model)
	{
		this.model=model;
	}
	public String get_model()
	{
		return this.model;
	}
	public void set_RAM_size(int RAM_size)
	{
		this.RAM_size=RAM_size;
	}
	public int get_RAM_size()
	{
		return this.RAM_size;
	}
	public void set_CPU_frequency(int CPU_frequency)
	{
		this.CPU_frequency=CPU_frequency;
	}
	public int get_CPU_frequency()
	{
		return this.CPU_frequency;
	}
	public void set_price(double price)
	{
		this.price=price;
	}
	public double get_price()
	{
		return this.price;
	}
	public void set_year(int year)
	{
		this.year=year;
	}
	public int get_year()
	{
		return this.year;
	}
	public void input()
	{	Scanner in = new Scanner(System.in);
		Laptop laptop = new Laptop("no-name",0,0,0,0);
		System.out.println("Enter laptop's model");
		name=in.nextLine();
		System.out.println("Enter laptop's RAM_size");
		age=in.nextInt();
		System.out.println("Enter laptop's CPU_frequency");
		wheit=in.nextInt();
		System.out.println("Enter laptop's price");
		price=in.nextDouble();
		System.out.println("Enter laptop's year");
		wheit=in.nextInt();
	}
	public void output()
	{
		System.out.println("Enter laptop's model "+model);
		System.out.println("Enter laptop's RAM_size "+ RAM_size);
		System.out.println("Enter laptop's CPU_frequency "+CPU_frequency);
		System.out.println("Enter laptop's price "+price);	
		System.out.println("Enter laptop's year "+year);		
	}
	public double add_price(double sum)
	{
		sum+=price;
		System.out.println("Total price: " + sum);
		return sum;
	}
}




