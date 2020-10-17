import java.util.Scanner;
public class Shop
{	
	static final int N=30;
	String name;
	int n;
	double cash;
	Laptop[] laptop= new Laptop[30];
	public Shop()
	{
		this.name="no name";
		this.n=0;
		this.cash=0f;
	}
	public Shop(String name, int n, double cash, Laptop[] laptop)
	{
		this.name=name;
		this.n=n;
		this.cash=cash;
		for (int i=0; i< n; i++)
		{
		this.laptop[i]=laptop[i];
		}
	}
	public void init(String name, int n, double cash, Laptop laptop)
	{
		this.name=name;
		this.n=n;
		this.cash=cash;		
		this.laptop[0]=laptop;		
	}
	public void init(String name, int n, double cash, Laptop[] laptop)
	{
		this.name=name;
		this.n=n;
		this.cash=cash;
		for (int i=0; i< n; i++)
		{
		this.laptop[i]=laptop[i];
		}
	}
	 public void display() {
        System.out.println("The name of the store: "+name);
		System.out.println("The number of laptops: "+n);
		System.out.println("Money: "+cash);
		System.out.println("");
		System.out.println("Laptops:");
		for (int i=0; i< n; i++)
		{
		System.out.println(i+1+": ");
		laptop[i].display();
		}
		System.out.println("");
    }
	public double addprice(Laptop l1, Laptop l2)
	{		
		return l1.getprice()+l2.getprice();
	}
	
	public double addprice(int n)
	{		
		double money=0;
		for (int i=0; i<n; i++)
		{
			money=money+laptop[i].getprice();
		}
		return money;
	}
	
	public int purchase(String model, int ram, int cpu, double price, int year)
	{ 		
		Laptop lap = new Laptop();
		lap.init(model, ram, cpu, price, year);
		this.laptop[n]=lap;
		this.cash=this.cash-price;
		n++;		
		return n;
	}
	public int sale()
	{
		for(int i=0; i<=n; i++)
		{
			this.cash+=this.laptop[i].getprice();			
			this.n-=1;
		}
		System.out.println("laptop's sold");
		return n;
	}	
}