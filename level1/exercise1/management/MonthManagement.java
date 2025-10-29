package TascaS103Collections.level1.exercise1.management;

import TascaS103Collections.level1.exercise1.model.Month;

import java.util.*;

public class MonthManagement {

	private List<Month> months = new ArrayList<>();
	Set<Month> noMonthsDuplicate;

	public MonthManagement(){
		addMonths();
		addingAugust();
		convertToHashSet();
		noAddDuplicates();
		traverseWithBucles();

	}

	private void addMonths(){
		String[] arrayMonths = {"January", "February", "March", "April", "May", "June",
							"July", "September", "November","December"};

		for(String m : arrayMonths){

			this.months.add(new Month(m));

		}
		System.out.println("The months now are: "+months);
	}

	private void addingAugust(){
		months.add(7, new Month("August"));


		System.out.println("The list of months updated: "+months);
	}

	private void convertToHashSet(){
		noMonthsDuplicate = new HashSet<>(months);
		System.out.println("The convert List to a HashSet looks like: "+noMonthsDuplicate);
	}

	private void noAddDuplicates(){
		System.out.println("Trying to add 'June' month again.");
		boolean added = noMonthsDuplicate.add(new Month("June"));
		if(added){
			System.out.println("The month has been added to the Set.");
		}else{
			System.out.println("The month has not been added to the Set");
		}
		System.out.println("The Set looks like: "+noMonthsDuplicate);
	}

	private void traverseWithBucles(){
		System.out.println("Traversing the List with a for.--");
		for(int i =0;i<months.size();i++){
			System.out.print(months.get(i).getNameMonth()+(i<months.size()-1 ? ", ": ""));

		}
		System.out.println();
		System.out.println("\nTraversing the Set with an Iterator...");

		Iterator<Month> itMonths = noMonthsDuplicate.iterator();

		while(itMonths.hasNext()){

			System.out.print(itMonths.next().getNameMonth()+(itMonths.hasNext() ? ", ": ""));

		}
	}
}
