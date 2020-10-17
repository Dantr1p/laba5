import java.util.Scanner;
public class Laptop
{	
	String model;
	int ram;
	int cpu;	
	double price;
	int year;
	
	public Laptop()
	{
		this.model="Model 0";
		this.ram=0;
		this.cpu=0;
		this.price=0;
		this.year=0;
	}
	public Laptop(String model, int ram, int cpu, double price, int year)
	{
		this.model=model;
		this.ram=ram;
		this.cpu=cpu;
		this.price=price;
		this.year=year;
	}
	public void init(String model, int ram, int cpu, double price, int year)
	{
		this.model=model;
		this.ram=ram;
		this.cpu=cpu;
		this.price=price;
		this.year=year;
	}
	
	public void display() {
        System.out.println("Notebook model: "+model);
		System.out.println("Laptop RAM: "+ram);
		System.out.println("Processor frequency: "+cpu);
		System.out.println("The price of the laptop: "+price);
		System.out.println("Year of production of the laptop: "+year);
    }
	public double getprice()
	{
		return this.price;
	}
	public String getmodel()
	{
		return this.model;
	}
}