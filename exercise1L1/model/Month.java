package TascaS103Collections.exercise1L1.model;

public class Month {

    // field class

    private String nameMonth;

    public Month(String nameMonth){
        this.nameMonth = nameMonth;
    }

    public String getNameMonth(){return nameMonth;}

    @Override
    public String toString(){
        return String.format("Month: %s",getNameMonth());
    }

}
