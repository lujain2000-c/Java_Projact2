// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Route r1 = new Route("Tait","Mecca",100.0);
        Route r2 = new Route("Mecca","Taif",70.0);
        Car car1 = new Car("1105",r1,0);
        Car car2 = new Car("1107",r2,5);
        Passenger subscriber = new Subscribers("Lujain","7",car1,100.0);
        Passenger nonSubscriber = new NonSubscribers("Lujain","10",car2,70.0,true);
        Passenger [] passengers = {subscriber,nonSubscriber};
//        for (int i = 0; i < passengers.length; i++){
//
//        }
        try{
            nonSubscriber.calculate(car2);
            nonSubscriber.toDisplay();
            subscriber.calculate(car1);
            subscriber.toDisplay();


        }catch(Exception e1){
            System.out.println(e1.getMessage());
        }




    }
}