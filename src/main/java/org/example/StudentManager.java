package org.example;

public class StudentManager {
    DataAccess da = new DataAccess();
    public void deleteStudent(){
        da.delFromImaginaryDB();
    }
}
