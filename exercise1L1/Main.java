package TascaS103Collections.exercise1L1;

import TascaS103Collections.exercise1L1.model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

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

        // add moths to the ArrayList

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

        for(int i = 0; i<months.size();i++){
            System.out.println(months.get(i));
        }

        System.out.println();

        // we create and add the 8th month
        // the August month is the 8th in the list of months but sthe ArrayList stars at 0 index,
        // so the August month will be 7th index in the ArrayList

        months.add(7, new Month("August"));

        for(Month m : months){
            System.out.println(m);
        }

        // convert the ArrayList to HashSet
        System.out.println();
        System.out.println("HashSet: ");
        HashSet<Month> months2 = new HashSet<>(months);


        // we create an Iterator for traverse the new HashSet collection
        Iterator<Month> it = months2.iterator();

        // we try to add the 12th month but the Set collections no admits duplicates
        months2.add(month12);
        System.out.print("[");

        // the next() argument helps to traverse the HashSet
        while(it.hasNext()){

            String month = it.next().getNameMonth();
            System.out.print(month+" -");

        }
        System.out.print("]");

    }
}
