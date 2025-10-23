package TascaS103Collections.exercise3L1.model;

public class User {


    private String name;
    private int score;


    public User(String name){
        this.name = name;
        this.score = 0;


    }

    public String getName(){return this.name;}

    public int getScore(){return this.score;}



    public void addPoint(){

		this.score++;
    }




    @Override
    public String toString(){
        return String.format("User: %s - Score: %d", getName(),getScore());
    }
}
