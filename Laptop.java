package petss;
import java.util.Scanner;
public class pets()
{
	private String name;
	private int age;
	private int wheit;
	private double price;
	public pets 
	{
		this.name="no_name";
		this.age=0;
		this.wheit=0;
		this.price=0;
	}
	public pets(String name, int age, int wheit, double price)
	{
		this.name=name;
		this.age=age;
		this.wheit=wheit;
		this.price=price;
	}
	public void set_name(String name)
	{
		this.name=name;
	}
	public String get_name()
	{
		return this.name;
	}
	public void set_age(int age)
	{
		this.age=age;
	}
	public int get_age()
	{
		return this.age;
	}
	public void set_wheit(int wheit)
	{
		this.wheit=wheit;
	}
	public int get_wheit()
	{
		return this.wheit;
	}
	public void set_price(double price)
	{
		this.price=price;
	}
	public double get_price()
	{
		return this.price;
	}
	public void input()
	{	Scanner in = new Scanner(System.in);
		pets pet = new pets("no-name",0,0,0);
		System.out.println("Enter pet's name");
		name=in.nextLine();
		System.out.println("Enter pet's age");
		age=in.nextInt();
		System.out.println("Enter pet's wheit");
		wheit=in.nextInt();
		System.out.println("Enter pet's price");
		price=in.nextDouble();
	}
	public void output()
	{
		System.out.println("Enter pet's name "+name);
		System.out.println("Enter pet's age "+ age);
		System.out.println("Enter pet's wheit "+wheit);
		System.out.println("Enter pet's price "+price);		
	}
	public double add_price(double sum)
	{
		sum+=price;
		System.out.println("Total price: " + sum);
		return sum;
	}
}