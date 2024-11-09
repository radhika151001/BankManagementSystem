package com.client;
import java.util.Scanner;
import com.service.Data;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("------------------------------Bank Management System------------------------------");
		
		Data d=new Data();
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Your Choice\n1.Create Account\n2.Display Details\n3.Deposite Money\n4.Withdrawl Money\n5.Check Balance");
			int ch=s.nextInt();
			switch (ch) {
			case 1:
				d.createAccount();
				System.out.println("\nAccount created successfully...\n");
				break;
			case 2:
				d.display();
				break;
			case 3:
				d.depositeMoney();
				break;
			case 4:
				d. withdrawlMoney();
				break;
			case 5:
				d. balanceCheck();
				break;
			default:
				System.out.println("Please Enter Valid option");
				System.exit(0);
				break;
				
				
			}
		}
	}

}
