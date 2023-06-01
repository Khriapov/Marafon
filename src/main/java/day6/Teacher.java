package day6;
import java.util.Random;
class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rand = new Random();
        int caunt = rand.nextInt(4) + 2;
        String grade = "";
        switch (caunt){
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }
        System.out.println("Преподователь " + this.name + " оценил студента с именем "+student.getName() + " по предмету "+this.subject+" на оценку "+grade);

    }
}
