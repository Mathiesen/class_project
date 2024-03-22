package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Studentlist = new ArrayList<>();
        System.out.println("Choose what you want to do. Press 1 for Adding student");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter studentid");
                String studentid = scanner.next();
                System.out.println("Enter firstname");
                String firstname = scanner.next();
                System.out.println("enter lastname");
                String lastname = scanner.next();
                Studentlist.add(new Student(studentid, firstname, lastname));
                System.out.println(Studentlist);
                break;
            case 2:
                // Perform "encrypt number" case.
                break;
            case 3:
                // Perform "decrypt number" case.
                break;
            case 4:
                // Perform "quit" case.
                break;
            default:
                // The user input an unexpected choice.
        }
    }
}