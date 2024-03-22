package org.example;

public class StudentManager {


    public void updateStudentName(String oldName, String newName){
        //vi har fucking antaget er der en student klasse og en liste med students
        for (Student student : students) {
            if (student.getName().equals(oldName)) {
                student.updateName(newName);
                break;
            }
        }
    }

    public void updateStudentAge(String name, int newAge){
        //vi har fucking antaget er der en student klasse og en liste med students
        for (Student student : students) {
            if (student.getAge().equals(oldAge)) {
                student.updateAge(newAge);
                break;
            }
        }
    }
}
