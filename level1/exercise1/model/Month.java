package TascaS103Collections.level1.exercise1.model;

import java.util.Objects;

public class Month {


    private String nameMonth;


    public Month(String nameMonth){

		this.nameMonth = nameMonth;
    }


    public String getNameMonth(){
		return nameMonth;}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Month month = (Month) o;
		return Objects.equals(nameMonth, month.nameMonth);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(nameMonth);
	}

	@Override
	public String toString() {
		return nameMonth;
	}
}
