package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Queen", 1970);
        MusicBand musicBand2 = new MusicBand("Bon Jovi", 1983);
        MusicBand musicBand3 = new MusicBand("green day", 1987);
        MusicBand musicBand4 = new MusicBand("Nirvana", 1990);
        MusicBand musicBand5 = new MusicBand("Louna ", 2008);
        MusicBand musicBand6 = new MusicBand("Disco", 1980);
        MusicBand musicBand7 = new MusicBand("Flop", 2001);
        MusicBand musicBand8 = new MusicBand("armparam", 1990);
        MusicBand musicBand9 = new MusicBand("Yang", 2020);
        MusicBand musicBand10 = new MusicBand("Bla bla", 2005);

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        groupsAfter2000(musicBands);

    }

    public static void groupsAfter2000(List<MusicBand> bands) {
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                System.out.print(band.getName() + " - " + band.getYear() + ", ");
            }
        }
    }
}
