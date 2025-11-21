import shows.*;
import theater_team.*;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Сергей", "Догадаев", Gender.MALE, 181);
        Actor actor2 = new Actor("Иванка", "Серебрякова", Gender.FEMALE, 172);
        Actor actor3 = new Actor("Александр", "Ермолаев", Gender.MALE, 188);

        Director director1 = new Director("Варвара", "Попова", Gender.FEMALE, 27);
        Director director2 = new Director("Сергей", "Гусев", Gender.MALE, 15);

        String choreographer = "Юра Борисов";
        String musicAuthor = "Николай Чугреев";

        Show show = new Show("Бабочки", 87, director1);
        show.addActor(actor1);
        show.addActor(actor3);

        Opera opera = new Opera("Коррида любви", 120, director1,
                musicAuthor, "Площадь, идут приготовления к корриде — появляется " +
                "Эскамильо — Кармен и Эскамильо клянутся друг другу в любви ", 12);
        opera.addActor(actor1);
        opera.addActor(actor2);

        Ballet ballet = new Ballet("Кармен", 120, director2,
                musicAuthor, "Кармен бросает кольцо, подаренное ей Доном Хозе, и хочет " +
                "уйти — тот убивает её ", choreographer);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println(show.toString());
        System.out.println(opera.toString());
        System.out.println(ballet.toString());

        ballet.swapActors(actor1, "Ермолаев");
        System.out.println(ballet.toString());

        opera.swapActors(actor3, "ДогадаеФ");
        System.out.println(opera.toString());

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
