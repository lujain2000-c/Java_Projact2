public class Subscribers extends Passenger {

    //private double cost ;


    public Subscribers(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
       // this.cost = cost;
    }

    @Override
    public void calculate(Car car) throws Exception {
        if(car.getMaxCapacity() == 0){
            throw new Exception("Capacity zero");
        }else {
            setTripCost(getReservedCar().getRoute().getTripPrice() - (getReservedCar().getRoute().getTripPrice() * 0.5));
        }
    }

    @Override
    public void toDisplay() {

        System.out.println("Reserved Car Info:"+"\n Name: "+getName()+"\n ID: "+getReservedCar().getCode()+" \n From: "+getReservedCar().getRoute().getStartAddress()+" to: "+getReservedCar().getRoute().getDestinationAddress()+" \nNumber of Passengers: "+getReservedCar().getMaxCapacity()+"\nTotal cost: "+ getTripCost());

    }
}
