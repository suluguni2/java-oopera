package theater_team;


public class Director extends Person {
    protected int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString(){
        return surname + " " + name;
    }

}
