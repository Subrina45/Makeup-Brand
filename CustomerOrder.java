package mypack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOrder {
	public String Bag;
	ArrayList<Sephora> MakeupList = new ArrayList<Sephora>();
	public float TotalPayment;
	
	public String getBag() {
		return Bag;
	}
	public void setTotalpayment(float TotalPayment) {
		this.TotalPayment = TotalPayment;
	}
	public void input() {
		Scanner bp = new Scanner(System.in);
		System.out.println("bag number: ");
		Bag = bp.nextLine();
	}
	public void print() {
		System.out.println("----------------");
		System.out.println("bag number: "+this.Bag+" total payment:  "+this.TotalPayment);
		for(Sephora m:this.MakeupList) {
			System.out.println("Selected products are "+m.Name);
		}
		System.out.println();
	}
	
	public void setMakeupList(Sephora sephora) {
		// TODO Auto-generated method stub
		
	}
	

}
