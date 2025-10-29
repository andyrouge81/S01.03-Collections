package TascaS103Collections.level1.exercise2.management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListManagement {
	List<Integer> numbers;
	List<Integer> reversedNumbers;

	public ListManagement(){
		this.numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		this.reversedNumbers = new ArrayList<>();
		showIntegerNumbers(this.numbers);
		reverseListNumbers(this.numbers);

	}

	private void showIntegerNumbers(List<Integer> list1){

		System.out.println("The list of numbers is: "+list1.toString());
	}

	private void reverseListNumbers(List<Integer> list2){

		ListIterator<Integer> itReverse = list2.listIterator(list2.getLast());
		System.out.print("The reverse list of numbers is: ");
		System.out.print("[ ");
		while(itReverse.hasPrevious()){
			int previousNumber = itReverse.previous();

			System.out.print(previousNumber+", ");

		}
		System.out.print("]");

	}

}




