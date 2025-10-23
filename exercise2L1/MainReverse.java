package TascaS103Collections.exercise2L1;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainReverse {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

		System.out.println("The list of numbers: ");
        for(Integer i : numbers){
            System.out.print(" - "+i);
        }

        System.out.println();

        List<Integer> reverseNumbers = new ArrayList<>(numbers);


        ListIterator<Integer> it = reverseNumbers.listIterator(reverseNumbers.getLast());

		System.out.println("The reverse list of numbers: ");
        while(it.hasPrevious()){
           int integerNumber = it.previous();
            System.out.print(" - "+integerNumber);

        }

    }
}
