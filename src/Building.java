public abstract class Building {

    /*Create an abstract class Building

    create instance variables:
    String location
    double price

    create abstract methods:
    void pay()

    create a constructor to assign the location & price
    override the toString to print the location & price */

    String location;
    double price;

    abstract void pay();


    public Building(String LLLlocation,double PPPprice){

        this.location =  LLLlocation;
        this.price = PPPprice;
    }

    public String toString(){

        return "Location -> " +  location  + "Price->" +price ;
    }

}
