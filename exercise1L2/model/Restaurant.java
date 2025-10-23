package TascaS103Collections.exercise1L2.model;


import java.util.Objects;

public class Restaurant  {


    private String name;
	private int score;

    public Restaurant(String name, int score){
        this.name = name;
        this.score = score;

    }


    public String getName(){return name;}

    public int getScore(){return score;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant rest1 = (Restaurant) o;
        return this.score == rest1.score && this.name.equals(rest1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }

    @Override
    public String toString(){
        return String.format("Restaurant: %s - Score: %d",getName(),getScore());
    }
}
