package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        parseFileToObjList(file);

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> arrayString = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 1)
                    throw new IllegalArgumentException();
                Person people = new Person(person[0], Integer.parseInt(person[1]));

                arrayString.add(people);
            }
            System.out.println(arrayString);
            return arrayString;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
