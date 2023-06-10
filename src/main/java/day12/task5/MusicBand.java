package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicAtrist> members = new ArrayList<>();

    public MusicBand(String name, int year, List<MusicAtrist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicAtrist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicAtrist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.getMembers().addAll(a.getMembers());
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
