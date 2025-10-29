package TascaS103Collections.level2.exercise2.main;

import TascaS103Collections.level2.exercise1.model.Restaurant;
import TascaS103Collections.level2.exercise2.model.RestaurantCompare;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<RestaurantCompare> sortRestauration = new TreeSet<>();



		sortRestauration.add(new RestaurantCompare("Can Pipo", 5));
		sortRestauration.add(new RestaurantCompare("Casa Ataulfo", 8));
		sortRestauration.add(new RestaurantCompare("Rosseta", 7));
		sortRestauration.add(new RestaurantCompare("Rosseta", 7));
		sortRestauration.add(new RestaurantCompare("Can Pipo", 7));



		Iterator<RestaurantCompare> it = sortRestauration.iterator();

		while(it.hasNext()){
			System.out.println(it.next());

		}


    }
}

