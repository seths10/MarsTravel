package Planet.Trying;

import java.util.ArrayList;

public class Trial {

    public static void main(String[] args) {
        Math.round(60);
    }
    private String firstName;
    private String surname;
    private int dateOfBirth;
    private ArrayList<String> interests;

    public String getFirstName(){
        return firstName;
    }

    public String getSurname(){
        return surname;
    }

    public int getDateOfBirth(){
        return dateOfBirth;
    }

    public ArrayList<String> getInterests(){
        return interests;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public void setSurname(String surname) {
        if(surname.length() <= 50) this.surname = surname;
    }

    public int getAge(int year) {
        return year - dateOfBirth;
    }

}
