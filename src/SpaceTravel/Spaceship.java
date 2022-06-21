package SpaceTravel;

import Seats.Seat;

import java.util.ArrayList;
import java.util.List;

public abstract class Spaceship {
    private int speed;
    private int capacity;
    private int safetyRating;
    private int safetyLimit;

    Spaceship(){
        if (getSpeed() > getSpeedLimit()){
            System.out.println("Speed limit reached");
        }
    }

    public final ArrayList<Seat> seats = new ArrayList<Seat>();


    public abstract int getCapacity();

    public abstract int getSpeedLimit();

    public abstract int getSpeed();
    public abstract int getSafetyRating();
}