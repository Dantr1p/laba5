import java.util.Scanner;
import shop.Shop;
import laptop.Laptop;

public class Main
{
	public static void main (String[] args)
	{	final int N=50;
		
		Scanner in = new Scanner(System.in);
		Laptop laptop1 = new Laptop("no_name",0,0,0,0);
		pet.input();
		double sum=0;
		sum=pet.add_price(sum);	 
		Shop store = new Shop("DND",1,0,laptop1);
		store.output();		 
		store.sale();
		store.output();
		System.out.println("Enter numbers of laptops");
		int n=in.nextInt();
		Laptop[] laptop2 = new Laptop[N];
		for(int i=0; i<n; i++)
		{
			laptop2[i] = new Laptop("no_name",0,0,0,0);
			laptop2[i].input();
			sum=laptop2[i].add_price(sum);
		}
		zooshop store1 = new zooshop("DNS",n,0,laptop2);
		store1.output();		
		store1.sale();
		store1.output();
		
	}
}