package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicAtrist> members1 = new ArrayList<>();
        members1.add(new MusicAtrist("Petr", 24));
        members1.add(new MusicAtrist("Ivan", 32));
        members1.add(new MusicAtrist("Fedor", 24));
        MusicBand musicBand1 = new MusicBand("red hot chili papers", 1970, members1);


        List<MusicAtrist> members2 = new ArrayList<>();
        members2.add(new MusicAtrist("Вася", 24));
        members2.add(new MusicAtrist("Сергей", 24));
        members2.add(new MusicAtrist("Георгий", 24));
        MusicBand musicBand2 = new MusicBand("Green day", 1985, members2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}
