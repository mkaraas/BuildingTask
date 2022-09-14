public class Apartment extends Building implements HasBalcony {

int monthOfLEase;


    public Apartment(String LLLlocation, double PPPprice, int monthOfLEase) {
        super(LLLlocation, PPPprice);
        this.monthOfLEase = monthOfLEase;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "monthOfLEase=" + monthOfLEase +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    public  void  pay(){

        System.out.println("paying apartment's rent");
    }

    public void openBalcony(){


        System.out.println("there are 3 balcony");
    }
}
