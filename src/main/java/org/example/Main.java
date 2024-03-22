package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Studentlist = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("hey");
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