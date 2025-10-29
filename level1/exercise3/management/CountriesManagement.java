package TascaS103Collections.level1.exercise3.management;

import TascaS103Collections.level1.exercise3.model.User;

import java.io.*;
import java.util.*;

public class CountriesManagement {
	private Map<String, String> capitalCountries;

	public CountriesManagement() {

		this.capitalCountries = new HashMap<>();

	}

	public void readAndSplitFileCountries(String path){
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

			if(path.isBlank()){
				System.out.println("No such file or directory.");
			}

			String line;
			while((line = bufferedReader.readLine()) != null){

				String[] words = line.split("\\s+");

				if(words.length == 2){
					capitalCountries.put(words[0].trim(), words[1].trim());
				}
			}


		}catch(IOException e){
			System.out.println("Error, path file incorrect.");
		}
	}

	public String addGamer(Scanner enter) {
		System.out.println("******Guess the country******");

		String userName;
		while(true){
			System.out.println("Enter your name: ");
			userName = enter.nextLine();
			try{
				if(userName.isBlank()){
					throw new InputMismatchException("You must entry a name.");

				}
				return userName;
			}catch (InputMismatchException e){
				System.out.println("Error!. "+e.getMessage());

			}
		}
	}

	public void startGame(User gamer, Scanner enter){
		List<String> countries = new ArrayList<>(capitalCountries.keySet());
		Collections.shuffle(countries);

		for(int i = 1; i<=10 ;i++){
			System.out.println("The capital of: "+countries.get(i));
			String userAnswer = enter.nextLine();

			if(userAnswer.isBlank()){
				throw new InputMismatchException("Please enter a capital.");

			}

			if(userAnswer.equalsIgnoreCase(capitalCountries.get(countries.get(i)))){
				System.out.println("Well done!, the capital of "+countries.get(i)+" is: "+ capitalCountries.get(countries.get(i)));
				System.out.println();
				gamer.addPoint();

			}else{
				System.err.println("Not is correct. The capital is: "+capitalCountries.get(countries.get(i)));
				System.out.println();
			}

		}

	}

	public void writeFile(String path, User gamer){

		String userScore = gamer.getName()+" -> "+ gamer.getScore()+ " points";

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
			writer.write(userScore);
			writer.newLine();
			System.out.println("Thanks for playing!");


		}catch (IOException e){
			System.err.println("Erros! File could not saved."+e.getMessage());

		}
	}

	public void showScores(String path){
		try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			String line;
			while((line = reader.readLine()) != null){
				String[] scores = line.split("->");

				String user = scores[0];
				String score =scores[1];
				System.out.println("The user: "+user+"has"+score);
			}
			reader.readLine();

		}catch (IOException e){
			System.err.println("Error! file not found.");

		}
	}
}
