package day6;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Student studentOne = new Student("Хряпов C.И.");
        Teacher teacherHistory = new Teacher("Веселов А.Б.","История");
        teacherHistory.evaluate(studentOne);
    }
}
