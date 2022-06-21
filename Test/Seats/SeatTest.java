package Seats;

import Passenger.Human;
import SpaceTravel.Stardelino;
import org.junit.Assert;
import org.junit.Test;

public class SeatTest {

    @Test
    public void checkCapacity(){
        Stardelino spaceship = new Stardelino();
        boolean t = false;
        while(!t){
            t = !spaceship.bookSeat(new Human("Seth"));
        }
        Assert.assertFalse(spaceship.bookSeat(new Human("Seth")));
    }

}