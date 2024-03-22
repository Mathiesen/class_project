package org.example;

public class StudentManager {

    DataAccess da = new DataAccess();
    public void deleteStudent(){
        da.delFromImaginaryDB();
        System.out.println("Calling database...");


    public void updateStudentName(String oldName, String newName){
        for (Student student : students) {
            if (student.getName().equals(oldName)) {
                student.updateName(newName);
                break;
            }
        }
    }

    public void updateStudentAge(String name, int newAge){
        for (Student student : students) {
            if (student.getAge().equals(oldAge)) {
                student.updateAge(newAge);
                break;
            }
        }
    }
}
