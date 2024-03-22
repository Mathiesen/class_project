package org.example;

public class StudentManager {
    DataAccess da = new DataAccess();
    public void deleteStudent(){
        da.delFromImaginaryDB();
        System.out.println("Calling database...");
    }
}
