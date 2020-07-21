package Vending_list;

import java.util.Scanner;

public class Vending_list {
	public static void main(String[] args) {
		while(true) {
			String drink = "";
			Scanner scan=new Scanner(System.in);
			int money= inputMoney(0);
			if(money>10) {
				System.out.println("select drink");
				drink =scan.next();
			}else {
				System.out.println("input money");
				inputMoney(money);
			}
			
			System.out.println("drink : " +drink);
			
		}
	}



static int inputMoney(int money) {
	Scanner scan=new Scanner(System.in);
	System.out.println("input money");
	int inputMoney=scan.nextInt();
	money +=inputMoney;
	return money;
}
}