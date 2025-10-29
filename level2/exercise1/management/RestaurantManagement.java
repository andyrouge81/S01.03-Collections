package TascaS103Collections.level2.exercise1.management;

import TascaS103Collections.level2.exercise1.model.Restaurant;

import java.util.*;

public class RestaurantManagement {

	Set<Restaurant> restaurants;


	public RestaurantManagement(){
		this.restaurants = new HashSet();

	}


	private void showRestaurants(){
		for(Restaurant re : this.restaurants){
			System.out.println(re);
		}
	}


	private void createRestaurant(Scanner enter) throws InputMismatchException{
		String nameRestaurant;
		int scoreRestaurant =0;
		while(true){
			try{
				System.out.println("Enter a restaurant name: ");
				nameRestaurant = enter.nextLine();
				break;
			}catch (InputMismatchException e){
				System.out.println("Enter a valid Restaurant name.");
				enter.nextLine();
			}

		}

		while(scoreRestaurant < 5 || scoreRestaurant > 10) {
			try{
				System.out.println("Enter a review points(to 5 up 10): ");
				scoreRestaurant = enter.nextInt();

				if(scoreRestaurant < 5 || scoreRestaurant >10){
						System.out.println("Enter a number between 5 to 10.");
				}

			}catch(InputMismatchException e){
				System.out.println("Enter valid punctuation.");
				enter.nextLine();
			}
		}

		addRestaurants(new Restaurant(nameRestaurant, scoreRestaurant));
	}

	private void addRestaurants(Restaurant restaurant){
		if(this.restaurants.contains(restaurant)){
			System.out.println("The restaurant already exists.");
		}else{
			this.restaurants.add(restaurant);
			System.out.println("Adding new restaurant...");

			}
		}

	public void menu(Scanner enter){

		while (true) {
			System.out.println("Restaurant Menu");
			System.out.println("1- Add a new  restaurant.");
			System.out.println("2- Show restaurants.");
			System.out.println("3- Exit");
			try{
				int option = enter.nextInt();
				enter.nextLine();
				switch(option){
					case 1 -> createRestaurant(enter);

					case 2 -> showRestaurants();

					case 3 -> {
						System.out.println("Thanks for use this app");
						return;
					}
					default -> System.out.println("Enter a valid option.");


				}
			}catch (InputMismatchException e){
				System.out.println("Please!.Enter an option available.");
				enter.nextLine();
			}
		}
	}


}
