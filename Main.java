import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{			
		Laptop lap1=new Laptop();		
		Shop store1= new Shop();		
		lap1.init("Asus", 3500, 16, 124000f, 2021);
		store1.init("DNS", 1, 0f, lap1);
		store1.display();
		System.out.println("Purchase ");
		int n=store1.purchase("Lenovo", 2500, 8, 50000*1.1, 2017);
		store1.display();
		
		System.out.println("N= "+n);
		System.out.println("Sum prices laptop's: "+store1.addprice(n));
		n=store1.sale();
		store1.display();
	}
}