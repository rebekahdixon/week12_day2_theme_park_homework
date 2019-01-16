public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
       if (visitor.getAge() >= 18){
           return true;
       }
           return false;
    }
}
