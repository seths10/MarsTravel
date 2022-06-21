package Passenger;

public abstract class Passenger {
    private String name;
    private int ID;

    public Passenger(){

    }

    public Passenger(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
