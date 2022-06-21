package Planet;

public class Mars extends Planet{
    @Override
    public boolean type(Planet p){
        return p instanceof Earth;
    }
}
