package TascaS103Collections.level2.exercise1.main;

import TascaS103Collections.level2.exercise1.management.RestaurantManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		RestaurantManagement launchManagement = new RestaurantManagement();
		launchManagement.menu(enter);
	}
}
