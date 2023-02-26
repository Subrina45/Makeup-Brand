package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageSephora {
	ArrayList<Sephora> MakeupList = new ArrayList();
	ArrayList<CustomerOrder> customerorder = new ArrayList<>();
	Sephora Sephora;
	public CustomerOrder CustomerOrder;
	public int SelectSephora;
	
	public ManageSephora() {
}
	Scanner bp = new Scanner(System.in);
	
	public void bp() {
		System.out.println("Enter amount of makeup in catalog");
		int n = Integer.parseInt(bp.nextLine());
		for (int i = 0; i < n; i++);
			Sephora sephora = new Sephora(null, n);
			sephora.input();
			MakeupList.add(sephora);
	}

public void print() {
	for (int i = 0; i < MakeupList.size(); i++) {
		System.out.println((i+1)+" "+MakeupList.get(i).detail());
	}
}
public void Price() {
	float PriceSephora = 0;
	float Totalpayment = 0;
	int number;
	CustomerOrder customer = new CustomerOrder();
	customer.input();
	customerorder.add(customer);
	for (int i = 0; i < 10; i++) {
		System.out.println("Select Makeup "+(i+1));
		SelectSephora = bp.nextInt();
		if(SelectSephora==0) {
			customer.setTotalpayment(Totalpayment);
			System.out.println("Total Payment");
			System.out.println(Totalpayment);
			System.out.println("Have a nice day!");
			break;
		}else {
			System.out.println("Enter number");
			number = bp.nextInt();
			Sephora sephora = Sephora.get(SelectSephora-1);
			customer.setMakeupList(sephora);
			PriceSephora = sephora.Price*number;
		}
		Totalpayment+=PriceSephora;
		System.out.println("Purchase completed");
		System.out.println("Pyament  "+(i+1)+" is:");
		System.out.println(" "+PriceSephora);
		System.out.println("Finish purchase enter 0");
	}
}
public void PrintOrder() {
	for (int i = 0; i < customerorder.size(); i++) {
		customerorder.get(i).print();
	}
}
public void search() {
	Scanner bp = new Scanner(System.in);
	String bag;
	int up = 0;
	System.out.println("Enter bag payment: ");
	bag = bp.nextLine();
	for (int i = 0; i < customerorder.size(); i++) {
		if (customerorder.get(i).getBag().equalsIgnoreCase(bag)) {
			customerorder.get(i).print();
			up++;
		}
	}
	if (up==0) {
		System.out.println("No bag number "+bag);
	}
}
public String EditName() {
	System.out.println("Enter name edit: ");
	return bp.nextLine();
}
public float EditPrice() {
	System.out.println("Enter price edit: ");
	return bp.nextFloat();
}
public void EditMakeup() {
	String namemakeup;
	int up = 0;
	System.out.println("Enter makeup name to fix");
	namemakeup = bp.nextLine();
	for (int i = 0; i < MakeupList.size(); i++) {
		if(MakeupList.get(i).getName().equals(namemakeup)) {
			up++;
			MakeupList.get(i).setName(EditName());
			MakeupList.get(i).setPrice(EditPrice());
			break;
		}
	}if (up==0) {
		System.out.println("No makeup name is "+namemakeup);
	}
}
public void DeleteMakeup() {
	String deletemakeup;
	int up = 0;
	System.out.println("Enter makeup name to delete");
	deletemakeup = bp.nextLine();
	for (int i = 0; i < MakeupList.size(); i++) {
		if (MakeupList.get(i).getName().equals(deletemakeup)) {
			up++;
			MakeupList.remove(i);
			System.out.println("delete finish");
			break;
		}
	}if (up==0) {
		System.out.println("No makeup name is "+deletemakeup);
	}
}


}
