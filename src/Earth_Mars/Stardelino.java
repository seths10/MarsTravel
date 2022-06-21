package Earth_Mars;

public class Stardelino extends Spaceship{
    public Stardelino(int capacity, int speed, int safety_rating) {
        super(capacity, speed, safety_rating);
    }

    public int getCapacity() {
        return super.capacity;
    }

    public int getSpeed() {
        return super.speed;
    }

    public int getSafetyRating() {
        return super.safety_rating;
    }
}
