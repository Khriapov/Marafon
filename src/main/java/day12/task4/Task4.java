package day12.task4;

import com.sun.marlin.DTransformingPathConsumer2D;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersOne = new ArrayList<>();
        membersOne.add("Веселов");
        membersOne.add("Петров");
        membersOne.add("Сидоров");
        membersOne.add("Яковлев");
        MusicBand musicBandOne = new MusicBand("Scorpons", 1970, membersOne);

        List<String> membersTwo = new ArrayList<>();
        membersTwo.add("Jacson");
        membersTwo.add("Paul");
        membersTwo.add("Merfi");
        MusicBand musicBandTwo = new MusicBand("Green Day", 1985, membersTwo);

        musicBandOne.printMembers();
        musicBandTwo.printMembers();
        MusicBand.transferMembers(musicBandOne, musicBandTwo);
        musicBandOne.printMembers();
        musicBandTwo.printMembers();
    }
}
