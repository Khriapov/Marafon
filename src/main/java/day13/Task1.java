package day13;

public class Task1 {
    public static void main(String[] args) {
        User userOne = new User("Сергей Сергеевич");
        User userTwo = new User("Дмитрий Дмитриевич");
        User userFree = new User("Василий Васильевич");

        userOne.sendMessage(userTwo, "Привет!");
        userOne.sendMessage(userTwo, "Как твои дела?");

        userTwo.sendMessage(userOne, "Привет!");
        userTwo.sendMessage(userOne, "Дела отлично");
        userTwo.sendMessage(userOne, "Ты завтра свободен?");

        userFree.sendMessage(userOne, "Привет!");
        userFree.sendMessage(userOne, "Как дела?");
        userFree.sendMessage(userOne, "Разговаривал со вторым насчет завтра?");

        userOne.sendMessage(userFree, "Привет!");
        userOne.sendMessage(userFree, "Дела замечательно");
        userOne.sendMessage(userFree, "Он только написал");

        userFree.sendMessage(userOne, "Как догворитесь - напиши мне!");
        MessageDatabase.showDialog(userOne, userFree);

    }
}