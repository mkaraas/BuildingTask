public class OfficeBuilding extends  Building implements HasElevetor {

    int numberOfFloors;

    public OfficeBuilding(String LLLlocation, double PPPprice, int numberOfFloors) {
        super(LLLlocation, PPPprice);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    public void pay(){

        System.out.println("paying rent of the office building");
    }

    public void elevator(int floor){
        System.out.println("using elevator in office" + floor);

    }
}
