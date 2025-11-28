package shows;

import theater_team.Actor;
import theater_team.Director;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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

    public void printDirector() {
        System.out.println(director.toString());
    }

    public void addActor(Actor actor) {
        boolean containsActor = listOfActors.contains(actor);
        if (containsActor) {
            System.out.println("Этот актёр уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.getSurname() + " добавлен в спектакль.");
        }
    }

    public void swapActors(Actor actor, String surname) {
        int count = numberOfLastNameMatches(surname);
        if (count > 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ошибка: в списке несколько актёров с фамилией " + surname);
            System.out.println("Желаете заменить всех актёров с фамилией " + surname + "?\n1-да, 0-нет");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                swapAllTheActors(actor, surname);
            }
            else if (choice == 0){
                System.out.println("Ни один актёр не был заменён");
            }
            else {
                System.out.println("Не корректный ввод. Ни один актёр не был заменён");
            }
            return;
        } else if (count == 0) {
            System.out.println("Актёр с фамилией " + surname + " отсутствует");
            return;
        }
        Iterator <Actor> iterator = listOfActors.iterator();
        while (iterator.hasNext()) {
            Actor anActor = iterator.next();
            if (anActor.getSurname().equals(surname)) {
                iterator.remove();
                listOfActors.add(actor);
                System.out.println("Актёр " + surname + " был заменён на актёра " + actor.getSurname() + ".");
                return;
            }
        }
    }

    private void swapAllTheActors(Actor actor, String surname) {
        Iterator <Actor> iterator = listOfActors.iterator();
        while (iterator.hasNext()) {
            Actor anActor = iterator.next();
            if (anActor.getSurname().equals(surname)) {
                iterator.remove();
            }
        }
        listOfActors.addFirst(actor);
        System.out.println("Актёры с фамилией " + surname + " были заменён на актёра " + actor.getSurname() + ".");
    }


    private int numberOfLastNameMatches(String surname){
        int count = 0;
        for (Actor anActor : listOfActors) {
            if (anActor.getSurname().equals(surname)) {
                count += 1;
            }
        }
        return count;
     }

    public void printActors() {
        String listActors = "";
        for (Actor actor : listOfActors) {
            listActors += actor.toString();
        }
        System.out.println(listActors);
    }
}
