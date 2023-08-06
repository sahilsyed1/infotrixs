package com.info.project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome To Employee Management Portal");
		System.out.println("_____________________________________");
		ArrayList<Employee> a=new ArrayList<Employee>();
		Scanner scn=new Scanner(System.in);
		System.out.println("Hi User Iam EMP\nI can do This Operations...");
		
		while(true) {
			System.out.println("1.Add Employee\n2.Update Employee\n3.Get Employee\n4.Delete Employee\n5.Exit");
			System.out.println();
			System.out.println("Please Enter Your Choice:-");
			int choice=scn.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Employee Id");
				int id=scn.nextInt();
				System.out.println("Enter Employee Name");
				String name=scn.next();
				System.out.println("Enter Employee age");
				int age=scn.nextInt();
				System.out.println("Enter Employee Loc");
				String loc=scn.next();
				a.add(new Employee(id, name, age, loc));
				Thread.sleep(2000);
				System.out.println("Employee "+a.size()+"added Successfully!!!");
				break;
			}
			case 2: {
				System.out.println("Enter Index Number of Employee you want to Update");
				int index=scn.nextInt();
				if(index<=-1 || index>=a.size()) {
					throw new IndexOutOfBoundsException();
				}
				a.remove(index);
				if(a.size()>=1) {
					System.out.println("Wait Renter your Updated Details...");
					Thread.sleep(2000);
					System.out.println("Enter Employee Id");
					int id=scn.nextInt();
					System.out.println("Enter Employee Name");
					String name=scn.next();
					System.out.println("Enter Employee age");
					int age=scn.nextInt();
					System.out.println("Enter Employee Loc");
					String loc=scn.next();
					a.add(index, new Employee(id, name, age, name));
					Thread.sleep(2000);
					System.out.println("Employee Updated Successfully!!!");
				}
				else {
					System.out.println("Sorry! DataBase is Empty so we cant Update");
				}
				break;
			}
			case 3: {
				System.out.println("Getting Employee Results....");
				Thread.sleep(2000);
				System.out.println("Your Employee details are here");
				System.out.println("_________________________________");
				if(a.size()>=1) {
					for(int i=0; i<a.size(); i++) {
						System.out.println("---Index Num---"+"["+i+"]");
						System.out.println(a.get(i));
						System.out.println();
					}
				}
				else {
					System.out.println("Sorry! DataBase is Empty so we cant Delete");
				}
				break;
			}
			case 4: {
				System.out.println("Enter Index Number of Employee you want to delete");
				int index=scn.nextInt();
				if(index<=-1 || index>=a.size()) {
					throw new IndexOutOfBoundsException();
				}
				a.remove(index);
				System.out.println("Deleting Employee Results....");
				Thread.sleep(2000);
				System.out.println("Employee Deleted Successfully!!!");
				break;
			}
			case 5: {
				System.out.println("Thank You for Using!!!");
				return;
			}
			default:
				System.out.println("Unexpected value: " + choice);
				break;
			}
			System.out.println();
		}
	}
}
