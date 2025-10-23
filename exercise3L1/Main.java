package TascaS103Collections.exercise3L1;

import TascaS103Collections.exercise3L1.model.User;

import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);


    String filePath = "src" + File.separator+"TascaS103Collections"+ File.separator+"exercise3L1"+ File.separator+"recurses"+File.separator+"countries.txt";

    String delimiter = " ";
    String[] words ;


    Map<String, String> newHashMap = new HashMap<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {


            String line = bufferedReader.readLine();

            while (line != null) {

                words = line.split(delimiter);

                if (words.length == 2) {
                    newHashMap.put(words[0].trim(), words[1].trim());

                }

                line = bufferedReader.readLine();

            }
        } catch (IOException e) {
            System.out.println("Directory or file not found."+e.getCause());

        }



        System.out.println("What's your name: ");
        String nameUser = enter.nextLine();


        User user1 = new User(nameUser);

        List<String> countries = new ArrayList<>(newHashMap.keySet());

        Collections.shuffle(countries);


        List<String> tenCountries = countries.subList(0,9);

        for(String c : tenCountries){
            System.out.println("What is the capital of: "+c);
            String userAnswer = enter.nextLine();
			if(userAnswer.isBlank()){
				System.out.println("You lose this turn.");
			}
            if(userAnswer.equalsIgnoreCase(newHashMap.get(c))){
                System.out.println("Well Done!.The capital of " +c+ " is "+userAnswer);
                user1.addPoint();
            }else{
                System.out.println("Not is correct. The capital is: "+ newHashMap.get(c));
            }
        }


        String userScore = user1.getName()+ " -> The final score is: "+user1.getScore();
        String saveFilePath ="src" + File.separator+"TascaS103Collections"+ File.separator+"exercise3L1"+ File.separator+"recurses"+File.separator+"classifications.txt";


        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(saveFilePath, true))){
           bufferedWriter.write(userScore);
           bufferedWriter.newLine();
            System.out.println("Thanks for playing with us!!.");



        }catch(IOException e){
            System.out.println("Fatal error. The file could not be save."+e.getCause());

        }


    enter.close();
    }


}

