package TascaS103Collections.exercise1L1;

import TascaS103Collections.exercise1L1.model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

		int i = 1;

        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month("April");
        Month month5 = new Month("May");
        Month month6 = new Month("June");
        Month month7 = new Month("July");
        Month month9 = new Month("September");
        Month month10 = new Month("October");
        Month month11 = new Month("November");
        Month month12 = new Month("December");



        months.add(month1);
        months.add(month2);
        months.add(month3);
        months.add(month4);
        months.add(month5);
        months.add(month6);
        months.add(month7);

        months.add(month9);
        months.add(month10);
        months.add(month11);
        months.add(month12);

		System.out.println("The list of months without 'August'.");
		for(Month month : months){
			System.out.println("Month "+i+ ": "+month.getNameMonth());
			i++;
		}

        System.out.println();


        months.add(7, new Month("August"));
		i = 1;
		System.out.println("The list of months adding August.");
        for(Month m : months){

            System.out.println("Month "+i+ ": "+m.getNameMonth());
			i++;
        }

        System.out.println();
        System.out.println("HashSet: ");
        Set<Month> months2 = new HashSet<>(months);

		Iterator<Month> it = months2.iterator();

		System.out.println("We try to add the 'December' month twice but only appears once.");
        months2.add(month12);
        System.out.print("[");


        while(it.hasNext()){

            String month = it.next().getNameMonth();
			System.out.print(month+", ");

        }
        System.out.print("]");

    }
}
