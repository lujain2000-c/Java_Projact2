public class NonSubscribers extends Passenger {

    private boolean discountCoupon;
  //  private double cost ;

    public NonSubscribers(String name, String ID, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, ID, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void calculate(Car car) throws Exception{
        if(car.getMaxCapacity() == 0){
            throw new Exception("Capacity zero");
        }else {

            if (discountCoupon) {
                setTripCost(getReservedCar().getRoute().getTripPrice() - (getReservedCar().getRoute().getTripPrice() * 0.1));
            } else {
                setTripCost(getReservedCar().getRoute().getTripPrice());
            }
        }

    }

    @Override
    public void toDisplay() {
      //  System.out.println("Name: "+getName()+"\n Reserved Car:"+getReservedCar().getCode()+getReservedCar().getRoute()+getReservedCar().getMaxCapacity()+"\nTotal cost: "+ getTripCost());
        System.out.println("Reserved Car Info:"+"\n Name: "+getName()+"\n Reserved Car:"+getReservedCar().getCode()+" \n From: "+getReservedCar().getRoute().getStartAddress()+" to: "+getReservedCar().getRoute().getDestinationAddress()+" \nNumber of Passengers: "+getReservedCar().getMaxCapacity()+"\nTotal cost: "+ getTripCost());

    }
}
