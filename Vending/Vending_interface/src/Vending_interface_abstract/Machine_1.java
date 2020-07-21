package Vending_interface_abstract;

import java.util.Scanner;

public class Machine_1 implements Allfunction{
	static int coin;
	@Override
	public void chooseproduct() {
		System.out.println("Please pick your choice");
		Scanner money =new Scanner(System.in);
		String sl = money.next();
	}
	public void input() {
		do {
		System.out.println("Please input money");
		Scanner money =new Scanner(System.in);
		coin =money.nextInt();
		}while (coin%10 !=0);
	
	} 
}
