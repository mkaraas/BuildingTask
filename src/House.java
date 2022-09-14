public class House extends Building implements hasBackyard , HasElevetor , HasBalcony {

    int numberOfResidents;


    public House(String LLLlocation, double PPPprice, int numberOfResidents) {
        super(LLLlocation, PPPprice);
        this.numberOfResidents = numberOfResidents;
    }


    @Override
    public void mowLawn() {
        System.out.println("cutting the grasses");
    }

    @Override
    public void elevator(int floor) {

        System.out.println("we are on the " + floor + "floor");
    }

    public  void openBalcony(){


        System.out.println("balcony");
    }

    public void pay(){


        System.out.println("paying rent");
    }

    @Override
    public String toString() {
        return super.toString() +  "number of residents->" + numberOfResidents;
    }
}
