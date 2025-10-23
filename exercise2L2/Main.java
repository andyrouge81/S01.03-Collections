package TascaS103Collections.exercise2L2;

import TascaS103Collections.exercise2L2.model.RestaurantCompare;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<RestaurantCompare> sortRestauration = new TreeSet<>();

        RestaurantCompare res1 = new RestaurantCompare("Can Pipo", 5);

        RestaurantCompare res2 = new RestaurantCompare("Casa Ataulfo", 8);

        RestaurantCompare res3 = new RestaurantCompare("Rosseta", 4);

        RestaurantCompare res4 = new RestaurantCompare("Rosseta", 7);

		sortRestauration.add(res1);
		sortRestauration.add(res2);
		sortRestauration.add(res3);
		sortRestauration.add(res4);



        for(RestaurantCompare r : sortRestauration){

            System.out.println(r);
        }

    }
}

