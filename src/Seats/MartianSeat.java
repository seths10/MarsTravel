package Seats;

public class MartianSeat extends Seat{
    public MartianSeat(int ID, String name){
        super();
    }

    @Override
    public void getMeal(){
        System.out.println("Seat number " + this.getID() + " would receive a martian meal");
    }
}
