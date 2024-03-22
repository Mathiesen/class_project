package org.example;

public class Student {

    private String studentid;
    private String Firstname;
    private String Lastname;

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public Student(String studentid, String firstname, String lastname) {
        this.studentid = studentid;
        Firstname = firstname;
        Lastname = lastname;
    }
}
