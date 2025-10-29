package TascaS103Collections.level1.exercise3.main;

import TascaS103Collections.level1.exercise3.management.CountriesManagement;
import TascaS103Collections.level1.exercise3.model.User;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);
		String filePath = "./src/TascaS103Collections/level1/exercise3/resources/countries.txt";
		String saveFilePath = "./src/TascaS103Collections/level1/exercise3/resources/classifications.txt";


		CountriesManagement launch = new CountriesManagement();
		launch.readAndSplitFileCountries(filePath);

		String gamer = launch.addGamer(enter);
		User gamer1 = new User(gamer);

		launch.startGame(gamer1, enter);
		launch.writeFile(saveFilePath, gamer1);
		launch.showScores(saveFilePath);

	}

}
