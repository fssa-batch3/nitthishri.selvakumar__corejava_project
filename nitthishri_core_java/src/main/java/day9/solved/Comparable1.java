package day9.solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Accounts implements Comparable<Accounts> {

	private String accNo;
	private String name;
	private double balance;

	public Accounts(String accNo, String name, double balance) {

		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int compareTo(Accounts o) {
		System.out.println(balance +" "+"balance");
		System.out.println(o.getBalance() +" "+"getbalance");
		

		if (balance == o.getBalance()) {
			return 0;
		} else {
			if (this.balance < o.getBalance()) {//
				return 1;
			} else {
				return -1;
			}
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}//

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class Comparable1 {
	public static void main(String[] args) {

		Accounts acct1 = new Accounts("A101", "Naresh", 1000);//
		Accounts acct2 = new Accounts("A102", "Arun", 5000);//
		Accounts acct3 = new Accounts("A103", "Karthik", 3000);//

		List<Accounts> list = new ArrayList<Accounts>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);

		System.out.println(list);

		Collections.sort(list);
		
		//Printing numbers sorted by balance
		System.out.println(list);

	}

}