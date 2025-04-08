import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskChooser {
    private static TaskList newTaskList = new TaskList();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int optionChosen = 0;
        do {

                System.out.println("Please choose one of the following options by typing it's number:");
                System.out.println("1 - Add a Task");
                System.out.println("2 - Get a Random Task From Your List");
                System.out.println("3 - Quit");
                optionChosen = scanner.nextInt();

                if (optionChosen == 1) {
                    newTaskList.addTask();
                }
                if (optionChosen == 2) {

                    String taskChosen = newTaskList.randomTask();
                    System.out.println(taskChosen);
                }



        }while (optionChosen != 3);
        scanner.close();
    }

}