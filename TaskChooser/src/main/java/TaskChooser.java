import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskChooser {
    public static void main(String[] args) {
        TaskList newTaskList = new TaskList();

        try (Scanner scanner = new Scanner(System.in)) {
            int optionChosen = 0;
            while (optionChosen != 3) {
                System.out.println("Please choose one of the following options by typing it's number:");
                System.out.println("1 - Add a Task");
                System.out.println("2 - Get a Random Task From Your List");
                System.out.println("3 - Quit");
                optionChosen = scanner.nextInt();
                if (optionChosen == 1) {
                        System.out.println("What task would you like to add?");
                        String task = scanner.nextLine();
                        newTaskList.addTask(task);
                }


            }
        }
    }
}
