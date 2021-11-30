package com.technoelevate.collection.casestudy1;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryMart {
	static Scanner sc = new Scanner(System.in);

	public static void adding() {
		System.out.println("how many items u require");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			System.out.println("enter the item no");
			int a4 = sc.nextInt();
			list.add(0);
		}
		viewAllItem();
	}

	public static void viewAllItem() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void remove() {
		list.remove(0);
	}

	static ArrayList list = new ArrayList();

	public static void main(String[] args) {

		System.out.println("Welcome to grocery Mart");
		System.out.println("Press 1 to view the items list");
		System.out.println("press 2 to add the grocery in list");
		System.out.println("press 3 to view your grocery bag");
		System.out.println("press 4 to Exit");

		int no = sc.nextInt();
		getList(no);

	}

	public static void max() {

	}

	public static void getList(int z) {
		if (z == 1) {
			String a[] = { "salt", "soap", "oil", "shampoo", "maggie", "milk" };
			for (int i = 1; i < a.length; i++) {
				System.out.println(i + " " + a[i]);
			}

		} else if (z == 2) {
			adding();

		}
		System.out.println("enter 2 to add the items in cart");
		int n = sc.nextInt();
		if (n == 2) {
			adding();
		}
	}
}
