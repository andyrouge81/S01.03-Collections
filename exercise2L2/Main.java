package TascaS103Collections.exercise2L2;

import TascaS103Collections.exercise2L2.model.RestaurantCompare;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<RestaurantCompare> sortrestauration = new TreeSet<>();

        RestaurantCompare res1 = new RestaurantCompare("Can Pipo", 5);

        RestaurantCompare res2 = new RestaurantCompare("Casa Ataulfo", 8);

        RestaurantCompare res3 = new RestaurantCompare("Rosseta", 4);

        RestaurantCompare res4 = new RestaurantCompare("Posseta", 7);

        sortrestauration.add(res1);
        sortrestauration.add(res2);
        sortrestauration.add(res3);
        sortrestauration.add(res4);


        for(RestaurantCompare r : sortrestauration){

            System.out.println(r);
        }

    }
}

