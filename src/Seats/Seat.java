package Seats;

public abstract class Seat {
    private int ID;
    private String name;

    public void fillData(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID(){
        return ID;
    }

    public void getMeal(){
        System.out.println("Seat number " + getID() + " would receive a meal");
    }
}
