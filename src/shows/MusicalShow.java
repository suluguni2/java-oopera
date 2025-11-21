package shows;

import theater_team.Director;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
