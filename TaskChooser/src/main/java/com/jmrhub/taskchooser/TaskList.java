package com.jmrhub.taskchooser;

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

    public void addTask(Scanner scanner){
        System.out.println("What task would you like to add?");

            String newTask = scanner.nextLine();
            tasks.add(newTask);
        System.out.println("***\nYou have " + tasks.size() + " task(s) on your list\n***\n");

    }
    public String randomTask() {
        if (tasks.isEmpty()) {
            return "**-Your list is empty, please add a task-**";
        }
        Collections.shuffle(tasks);
        String taskChosen = tasks.getFirst();
        tasks.remove(0);
        return "***\nThe task chosen for you is " + taskChosen +
                ".\n***\n\nYou have " + tasks.size() + " tasks remaining." ;

    }
    public void displayTasks(){
        if(tasks.isEmpty()){
            System.out.println("Your task list is empty.");
        } else {
            System.out.println("******* Your Task List *******");
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i + 1) + ".) " + tasks.get(i));
            }
        }

    }
}
