package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		ArrayList<Sephora> MakeupList = new ArrayList<>();
		ManageSephora managesephora = new ManageSephora();
		int select;
		
		Scanner bp = new Scanner(System.in);
		do {
			Catalogmain();
			select = Integer.parseInt(bp.nextLine());
			switch (select) {
			case 1:
				do {
				CatalogManageSephora();
				select = Integer.parseInt(bp.nextLine());
				switch (select) {
				case 1:
					managesephora.bp();
					break;
				case 2:
					managesephora.print();
					managesephora.EditMakeup();
					break;
				case 3:
					managesephora.print();
					managesephora.DeleteMakeup();
					break;
				case 4:
					managesephora.PrintOrder();
					break;
				case 5:
					managesephora.search();
					break;
				case 0:
					System.out.println("back");
					break;
					
					default:
						break;
				}
			}while (select !=3);
				
				break;
			case 2:
				do {
					Catalogorder();
					select = Integer.parseInt(bp.nextLine());
					switch (select) {
					case 1:
						managesephora.print();
						managesephora.Price();
						break;
					case 0:
						System.out.println("back");
						break;
						
						default:
							break;
					}
				}while (select !=0);
					
					break;
				
				default:
					break;
			}
		}while (select !=3);
		
	}
	static void CatalogManageSephora() {
		System.out.println("-------CATALOG ManageSephora--------");
		System.out.println("0. BACK TO CATALOG MAIN");
		System.out.println("1. Add Sephora");
		System.out.println("2. Edit Sephora");
		System.out.println("3. Delete Sephora");
		System.out.println("4. Print info bag order");
		System.out.println("5. Payment");
		System.out.println("----------------------------");
		System.out.println("select");
	}

		
		
	static void Catalogorder() {
		System.out.println("-------CATALOG ORDER--------");
		System.out.println("0. BACK TO CATALOG MAIN");
		System.out.println("1. Print Catalog sephora and order");
		System.out.println("----------------------------------");
		System.out.println("select");
	}

static void Catalogmain() {
	System.out.println("-------Catalog MAIN--------");
	System.out.println("1. Mangage Sephora");
	System.out.println("2. Manage order");
	System.out.println("2. Exit");
}
}
