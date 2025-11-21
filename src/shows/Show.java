package shows;

import theater_team.Actor;
import theater_team.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        boolean containsActor = listOfActors.contains(actor);
        if (containsActor) {
            System.out.println("Этот актёр уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр добавлен в спектакль.");
        }
    }

    public void swapActors(Actor actor, String surname) {
        for (Actor anActor : listOfActors) {
            if (anActor.getSurname().equals(surname)) {
                listOfActors.remove(anActor);
                listOfActors.add(actor);
                System.out.println("Актёр " + surname + " был заменён на актёра " + actor.getSurname() + ".");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " отсутствует");
    }

    @Override
    public String toString() {
        String listActors = "";
        for (Actor actor : listOfActors) {
            listActors += actor.getSurname() + " " + actor.getName() + " " + "(" + actor.getHeight() + ")\n";
        }
        return listActors;
    }
}
