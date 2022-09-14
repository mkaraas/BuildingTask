import java.util.ArrayList;

public class BuildingMarekt {

    public static void main(String[] args) {
        ArrayList<Building>  allBuilding = new ArrayList<>();



        allBuilding.add(new House("Pittsburgh",2050,2));

        allBuilding.add(new Apartment("Nyc", 4500, 12));

        allBuilding.add(new Apartment("New Jersey", 5500,6));

        allBuilding.add(new OfficeBuilding("Nyc",30_000,2));

        for (Building each : allBuilding) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------------------");




        double maxPrice = allBuilding.get(0).price;
        double minPrice = allBuilding.get(0).price;
        for(Building each : allBuilding){

            if(each.price >maxPrice){

                maxPrice = each.price;   //Max
            }

            if(each.price<minPrice){
                minPrice=each.price; //Min
            }

            if(each.location.equalsIgnoreCase("nyc")){

                System.out.println(each);  // specific location
            }

            if(each.price >2000  && each.price <4501){

                System.out.println("between 2000 to 4501   "+each);
            }


        }
        System.out.println("max price "+maxPrice);

        System.out.println("Min price "+minPrice);





    }
}
