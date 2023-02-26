package mypack;

import java.util.Scanner;

public class Sephora {
	public String Name;
	public float Price;
	
	public Sephora(String Name, float Price) {
		this.Name = Name;
		this.Price = Price;
	}
	public void input() {
		Scanner bp = new Scanner(System.in);
		System.out.println("Enter Name Sephora");
		Name = bp.nextLine();
		System.out.println("Enter Price Sephora");
		Price = bp.nextFloat();
	}
	
	public void Payment() {
		System.out.println("Price "+Price);
	}
	public String detail() {
		return Name+"  "+Price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;	
	}
	public void setPrice(Float Price) {
		this.Price = Price;
	}
	public Sephora get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

	}

