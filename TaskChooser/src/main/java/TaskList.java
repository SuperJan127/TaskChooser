import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public TaskList() {}

    public void addTask(){
        System.out.println("What task would you like to add?");
        Scanner taskScanner = new Scanner(System.in);
            String newTask = taskScanner.nextLine();
            tasks.add(newTask);

    }
    public String randomTask() {
        if (tasks.isEmpty()) {
            return "Your list is empty, please add a task";
        }
        Collections.shuffle(tasks);
        String taskChosen = tasks.getFirst();
        tasks.removeFirst();
        return "The task chosen for you is " + taskChosen;

    }
}
