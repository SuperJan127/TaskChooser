package com.jmrhub.taskchooser;

import java.util.Scanner;

public class TaskChooser {
    private static TaskList newTaskList = new TaskList();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String optionChosen;
        do {
                System.out.println("\n***");
                System.out.println("Please choose one of the following options by typing its number:");
                System.out.println("1 - Add a Task");
                System.out.println("2 - Get a Random Task From Your List");
                System.out.println("3 - Display Task List");
                System.out.println("4 - Exit");
                System.out.println("***");
                System.out.print("Choice: ");
                optionChosen = scanner.nextLine();


            switch (optionChosen) {
                case "1":
                    newTaskList.addTask(scanner);
                    break;
                case "2":
                    String taskChosen = newTaskList.randomTask();
                    System.out.println(taskChosen);
                    break;
                case "3":
                    newTaskList.displayTasks();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
            }



        }while (!optionChosen.equals("4"));
        scanner.close();
    }

}