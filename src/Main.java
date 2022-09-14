public class Main{


    public static void main(String[] args) {

        House h1 = new House("Nyc", 5_000, 3);

        Building h2 = new House("pittsburgh", 2500, 4);

        h1.openBalcony();
        h1.pay();


        h2.pay();
        System.out.println(h2.location + h2.price);
        // h2.openBalcony();

        hasBackyard h3 = new House("Phily, PA", 2300, 5);
        h3.mowLawn();


        HasElevetor h4 = new OfficeBuilding("Miami", 10_000, 4);

        h4.pay();
        h4.elevator(3);


        System.out.println(BuildingUtil.rent(h1));

        System.out.println(BuildingUtil.search("FairFax"));


    }


}

class BuildingUtil {

     public static double rent(Building b1) {

        if (b1 instanceof House) {
            return 1500;
        } else if (b1 instanceof Apartment) {
            return 800;
        } else if (b1 instanceof OfficeBuilding) {
            return 2000;
        }
        return 0.0;
    }

   public static Building search(String location) {

        Building build = new House("Great Falls", 500_00, 4);
        Building apartment = new Apartment("FairFax", 250_000, 6);
        Building officebuilding = new Apartment("McLEan", 2_000_000, 6);

        if (location.equals("Great Falls")) {
            return build;// new House("Great Falls", 500_00, 4);
        } else if (location.equals("FairFax")) {
            return apartment; //new Apartment("FairFax", 250_000, 6);
        }
        else if (location.equals("McLean")) {
            return officebuilding;  // new Apartment("McLEan", 2_000_000, 6);
        }

return null;
    }

}