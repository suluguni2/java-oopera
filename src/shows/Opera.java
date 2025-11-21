package shows;

import theater_team.Director;

public class Opera extends MusicalShow {
    protected int choirSize; // количество человек в хоре

    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
