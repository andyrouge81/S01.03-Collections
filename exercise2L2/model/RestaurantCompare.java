package TascaS103Collections.exercise2L2.model;


public class RestaurantCompare implements Comparable<RestaurantCompare> {



    private String name;
    private int score;

    public RestaurantCompare(String name, int score){
        this.name = name;
        this.score = score;

    }

    public String getName(){return this.name;}

    public int getScore(){return this.score;}

    @Override
    public int compareTo(RestaurantCompare o) {
        int compareName = this.name.compareToIgnoreCase(o.name);
        if(compareName == 0){// si son iguales, entonces compara esto otro
            return Integer.compare(o.score, this.score);
        }
        return compareName;
    }



    @Override
    public String toString(){
        return String.format("Restaurant: %s | Score: %d",getName(),getScore());
    }
}
