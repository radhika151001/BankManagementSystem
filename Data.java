package com.service;

import java.util.Scanner;

import com.model.Account;

public class Data  {
	int num1=0, num2=0,num3=0;
	
	Account a=new Account();
	Scanner s=new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("Enter Account Holder's name:");
		String accHolderName=s.next()+s.nextLine();
		for(int i=0;i<accHolderName.length();i++) {
			if(('A'<=accHolderName.charAt(i) || accHolderName.charAt(i)>='Z') || (accHolderName.charAt(i)>='a') || accHolderName.charAt(i)==' ' ) {
				a.setAccHolderName(accHolderName);
			}
			else  {
				System.out.println("Name can not contain number or special character");
				System.exit(0);
			}
		}
		
		
		System.out.println("Enter Account Number:");
		int accountNumber=s.nextInt();
		a.setAccountNumber(accountNumber);
		while(accountNumber!=0) {
			accountNumber/=10;
			num1++;
		}
		if(num1!=8) {
			System.out.println("Please enter 8 digit Account Number");
			System.exit(0);
		}
		
		
		System.out.println("Enter Age:");
		int age=s.nextInt();
		if(age<18 && age<100) {
			System.out.println("Age should be greater than 18");
			System.exit(0);
		}
		a.setAge(age);
		
		System.out.println("Enter Mobile Number:");
		long mobileNo=s.nextLong();
		a.setMobileNo(mobileNo);
		while(mobileNo!=0) {
			mobileNo/=10;
			num2++;
		}
		
		if(num2!=10 ) {
			System.out.println("Mobile number should be only 10 digit");
			System.exit(0);
		}
		
		
		
		
		System.out.println("Enter AADHAR Number:");
		long aadharNo=s.nextLong();
		a.setAadharNo(aadharNo);
		while(aadharNo!=0) {
			aadharNo/=10;
			num3++;
		}
		if(num3!=12) {
			System.out.println("AADHAR number should be 12 digits only");
			System.exit(0);
		}
		
	
		System.out.println("Enter Address:");
		String address=s.next()+s.nextLine();
		a.setAddress(address);
		
		System.out.println("Enter Account Balance:");
		double accountBalance=s.nextDouble();
		if(accountBalance<1000) {
			System.out.println("Account Balance should be minimum 1000 rupees");
			System.exit(0);
		}
		a.setAccountBalance(accountBalance);
	}
	
	public void display() {
		
		System.out.println("Account Holder Name:"+a.getAccHolderName());;
		System.out.println("Account number:"+a.getAccountNumber());
		System.out.println("Age:"+a.getAge());
		System.out.println("Mobile Number: "+a.getMobileNo());
		System.out.println("Aadhar number:"+a.getAadharNo());
		System.out.println("Address:"+a.getAddress());
		System.out.println("Account Balance:"+a.getAccountBalance());
		
		
	}
	
	public void depositeMoney() {
		System.out.println("Enter Amount to Deposite:");
		double depositeAmount=s.nextDouble();
		if(depositeAmount<100 || depositeAmount>100000) {
			System.out.println("Deposite amount should be greater than 100 and less than 100000");
			System.exit(0);
		}
		else
		{
		double totalBalance=a.getAccountBalance()+ depositeAmount;
		System.out.println("Your total balance is:"+totalBalance);
		a.setAccountBalance(totalBalance);
		}
	}
	
	public void withdrawlMoney() {
		System.out.println("Enter Amount to Withdrawl:");
		double withdrawlAmount=s.nextDouble();
		
		if(withdrawlAmount> a.getAccountBalance()) {
			System.out.println("Withdrawl amount should be less than your balance");
			System.out.println("Your account balance is:"+a.getAccountBalance());
			System.exit(0);
		}
			else if(withdrawlAmount<500 || withdrawlAmount>20000) {
				System.out.println("Withdrawl amount should be greater than 500 and less than 20000");
			System.exit(0);
		}
		
		double remainingAmount=a.getAccountBalance()-withdrawlAmount;
		if(remainingAmount<1000) {
			System.out.println("Remaining account balance should be greater than 1000");
			System.out.println("Your account balance is:"+a.getAccountBalance());
			System.exit(0);
		}
		System.out.println("Your remaining balance is:"+remainingAmount);
		a.setAccountBalance(remainingAmount);
		
	}
	
	public void balanceCheck() {
		System.out.println("Your Account Balance is:"+a.getAccountBalance());
	}

}
