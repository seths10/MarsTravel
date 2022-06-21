package Seats;

public class HumanSeat extends Seat{
    public HumanSeat(int ID, String name){
        super();
    }

    @Override
    public void getMeal(){
        System.out.println("Seat number " + this.getID() + " would receive a human meal");
    }
}
