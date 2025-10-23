package TascaS103Collections.exercise1L2;

import TascaS103Collections.exercise1L2.model.Restaurant;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Restaurant> restauration = new HashSet<>();

        Restaurant res1 = new Restaurant("Can Pipo", 6);

        Restaurant res2 = new Restaurant("Can Pipo", 6);

        Restaurant res3 = new Restaurant("Rossetta", 6);

        Restaurant res4 = new Restaurant("Rossetta", 7);

        restauration.add(res1);
        restauration.add(res2);
        restauration.add(res3);
        restauration.add(res4);

        for(Restaurant r : restauration){

            System.out.println(r);
        }
		System.out.println();
		System.out.println("This is explanation why the 'Can Pipo' restaurant hasn't add to a HasSet twice, \nbecause they are" +
								   " the same object and the Set collection doesn't allow for add same objects.");
        System.out.println("Hashcode: "+res1.hashCode());
        System.out.println("Hashcode: "+res2.hashCode());


    }
}
