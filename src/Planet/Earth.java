package Planet;

public class Earth extends Planet{
    @Override
    public boolean type(Planet p){
        return p instanceof Earth;
    }
}
