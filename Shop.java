package shop;
import laptop.*;
public class Shop
{	private static final int N = 50;
	private string name;
	private int n;
	private double cash;
	private Laptop[] laptop = new Laptop[LEN];
		
	public Shop(string name, int n, double cash, Laptop[] laptop)
	{
		this.name=name;
		this.n=n;
		this.cash=cash;		
		for(int i=0; i<col; i++)
		{
			this.laptop[i]=laptop[i];
		}
	}
	public Shop(string name, int n, double cash, Laptop laptop)
	{
		this.name=name;
		this.n=n;
		this.cash=cash;	
		for(int i=0; i<col; i++)
		{
			this.laptop[i]=laptop;
		}
	
	}
	public void set_name(string name)
	{
		this.name=name;
	}
	public string get_name()
	{
		return this.name;
	}
	public void set_n(int n)
	{
		this.n=n;
	}
	public int get_n()
	{
		return this.n;
	}
	public void set_cash(double cash)
	{
		this.cash=cash;
	}
	public double  get_cash()
	{
		return this.cash;
	}	
	public void read()
	{
		System.out.println("The name of store : " +name);
		System.out.println("The numbers of laptops : " +n);
		System.out.println("Store money is " +cash);		
	}
	public void output()
	{
		System.out.println("The name of store : " +name);
		System.out.println("The numbers of laptops : " +n);		
		System.out.println("Store money is " +cash);		
		for(int i=0; i<n; i++)
		{
		
		System.out.println("Enter laptop's model "+laptop[i].get_model());
		System.out.println("Enter laptop's RAM_size "+laptop[i].get_RAM_size());
		System.out.println("Enter laptop's CPU_frequency "+laptop[i].get_CPU_frequency());
		System.out.println("Enter laptop's price "+laptop[i].get_price());
		System.out.println("Enter laptop's year "+laptop[i].get_year());
		System.out.println();
		}
		
	}	
	public void sale()
	{
		for(int i=0; i<=n; i++)
		{
			this.cash+=this.laptop[i].get_price();			
			this.col-=1;
		}
		System.out.println("Laptop's sold");
	}
}
