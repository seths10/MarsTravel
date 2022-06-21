package SpaceTravel;

import Passenger.Human;
import Passenger.Martian;
import Seats.HumanSeat;
import Seats.MartianSeat;

public class Spacer extends Spaceship{

    @Override
    public int getCapacity() {
        return  20;
    }

    @Override
    public int getSpeedLimit() {
        return 0;
    }

    @Override
    public int getSafetyRating() {
        return 4;
    }

    @Override
    public int getSpeed() {
        return 450;
    }

    public boolean bookSeat(Martian ex) {
        if (this.getCapacity() < this.seats.size()){
            int ID = this.getCapacity() + 1;
            String name = ex.getName();
            MartianSeat newseat = new MartianSeat(ID, name);
            this.seats.add(newseat);
            newseat.getMeal();
            return true;
        } else {
            System.out.println("Ship is full");
            return false;
        }
    }

    public boolean bookSeat(Human ex) {
        if (this.getCapacity() < this.seats.size()){
            int ID = this.getCapacity() + 1;
            String name = ex.getName();
            HumanSeat newseat = new HumanSeat(ID, name);
            this.seats.add(newseat);
            newseat.getMeal();
            return true;
        } else {
            System.out.println("Ship is full");
            return false;
        }
    }
}