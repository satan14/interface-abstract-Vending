package fixed;

import java.util.Scanner;

public class Fixed_Vendingmachine {
	static int money=0;
	public static void main(String[] args) {
		String productA = "coke";
		String productB = "juice";
		String productC = "milk";
		
		int productAPrice = 100;
		int productBPrice = 200;
		int productCPrice = 300;
		
		boolean checkmoney = true;
		boolean checkmore = true;
		
		Scanner scan = new Scanner(System.in);
//		Scanner scan2 = new Scanner(System.in);
		while(checkmore) 
		{
		System.out.println("Please input you money");
		money += scan.nextInt();
		System.out.println("check your money: " +money);
		if(money<  productAPrice  || money<  productBPrice || money<  productCPrice ) {
			System.out.println("want more?please input y or n");
			String checkString=scan.next();
			if(checkString.equals("y")) {
				
			}
			else {
				System.out.println("Goodbye");
				checkmore=false;
					}
			}
		else {
			while(checkmore) {
				System.out.println("please select product 1." +productA +"(100)" +"2."  +productB +"200"+"3."  +productC +"300" );
				String selectProduct= scan.next();
				if(selectProduct.equals(productA)) {
					if(productAPrice>money) {
						checkmore = true;
						break;
					}
					money = money -productAPrice;
				} else if(selectProduct.equals(productB)) {
					if(productBPrice>money) {
						checkmore = true;
						break;
					}
					money = money -productBPrice;
				}
				else if(selectProduct.equals(productC)) {
					if(productCPrice>money) {
						checkmore = true;
						break;
					}
					money = money -productCPrice;
				}
				System.out.println("want more select product? y or n?");
				String checkMorestring =scan.next();
				if(checkMorestring.equals("y")) {
					
				}
				else {
					System.out.println( +money +"goodbye");
					checkmore= false;
				}
			}
		}
		}
	}
	
}