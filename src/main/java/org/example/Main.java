package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            int option = scanner.nextInt();

            switch (option){
                case 2:
                    System.out.println("Enter the ID of the student you want to delete:");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();
                    sm.deleteStudent();

            }
        }
    }
}