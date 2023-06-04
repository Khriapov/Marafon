package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Хряпов С.И.", "бухгалтера");
        Teacher teacher = new Teacher("Веселов В.И.", "Основы ПБУ");
        System.out.println("Название учебной группы " + student.getGroupName());
        System.out.println("Название предмета " + teacher.getSubjectName());
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}
