package tao_bank;
import java.util.*;
import java.io.*;
//import javax.swing.JOptionPane;

public class bank_account {
int account_num = 123456789;
static double balance= 50.0;
static String customer_name = "Tao";
static String email = "tao950823@gmail.com";
static String phone_number = "5177752153";
static long number= Long.parseLong(phone_number);
//System.out.println(number);

public static void main(String[] args) {
//	System.out.println(number);
//	System.out.println(balance);
//	System.out.println(customer_name);
//	System.out.println(email);
	Scanner myObj = new Scanner(System.in);

    System.out.println("Enter actions withdraw amount/deposit amount/show account balance/exit 0:");
    String command = myObj.next();
	//System.out.println(command);

    double amount = myObj.nextFloat();
	//System.out.println(amount);

    if (command.contains("withdraw")) {
    	withdraw(amount);
//    	double new_balance=balance-amount;
//    	balance = new_balance;
//    	System.out.println(balance);
    }
    else if(command.contains("deposit")) {
    	deposit(amount);
    	
    }
    else if (command.contains("balance")) {
    	funds_print(amount);
    }
//    else if(command.contains("exit"))
//    	{
//    	System.out.println("See you next time");
//    	System.exit(0);
//    	}
    else
    {
    	System.out.println("See you next time");
    	System.exit(0);
    }

}

public static void deposit(double amount) {
	double newbalance= balance+amount;
	balance = newbalance;
	System.out.println(balance);

}
public static void withdraw(double amount) {
	if(balance>amount) {
	double new_balance=balance-amount;
	balance = new_balance;
	System.out.println(balance);
	}
	else 
	{	System.out.println("lack of money");
}
	
}

public static void funds_print(double amount) {
	double newbalance= balance+amount;
	balance = newbalance;
	//return balance;
	System.out.println("tao's balance is  "+balance);
}

public void print_all() {
	//double newbalance= balance+amount;
	//balance = newbalance;
	//return balance;
	System.out.println(number);
	System.out.println(balance);
	System.out.println(customer_name);
	System.out.println(email);
	System.out.println("tao's balance is"+balance);
}

}

