package com.amazing.shoppingcart;


public class Employee {
//tao950823@gmail.com
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	private String name;
	private String company;
	private String location;


//Constructors
public Employee(){}
public Employee( String name, String location, String company)
{
   
    this.name= name;
    this.location = location;
    this.company = company;
   
}

public String getname() { return name; }
public void setname(String usrname) { this.name = name; }
public String getcompany() { return company; }
public void setcompany(String company) { this.company = company; }
public String getlocation() { return location; }
public void setlocation(String location) { this.location = location; }
public static void main(String args[]) 
{ 
    System.out.println("Hi, this is Tao"); 
} 

}
