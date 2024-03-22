package org.example;

public class DataAccess {
    public void delFromImaginaryDB(){
        String preparedStatement = "DELETE Student FROM ListOfStudent WHERE Id = ?";
        int ctrl = 0; //skal forestille try and catch på en db
        if (ctrl == 0){
            System.out.println("Student deleted" + preparedStatement);
        } else {
            System.out.println("Couldn't find student");
        }
    }
}
