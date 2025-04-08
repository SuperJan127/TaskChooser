import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskList {
    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public TaskList() {}

    public void addTask(String task){
        tasks.add(task);
    }
    public String randomTask(){
        Collections.shuffle(tasks);
        return tasks.getFirst();
    }
}
