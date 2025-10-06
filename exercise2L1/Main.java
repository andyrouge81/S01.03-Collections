package TascaS103Collections.exercise2L1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        // we create the first integer List
        List<Integer> numbers = new ArrayList<>();

        // we add elementes to the first List
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(Integer i : numbers){
            System.out.print(" - "+i);
        }
        System.out.println();
        // we create the second integer List
        List<Integer> reverseNumbers = new ArrayList<>(numbers);

        /* check the reverseNumbers isn't empty
        for(Integer i : reverseNumbers){
            System.out.println(i);
        }*/

        // we create a listIterator and we move at the last position to make a reverse List
        ListIterator<Integer> it = reverseNumbers.listIterator(numbers.getLast());

        // with hasPrevious we traverse in the listIterator to the last position to the first position
        while(it.hasPrevious()){
           int integerNumber = it.previous();
            System.out.print(" - "+integerNumber);

        }



    }
}
