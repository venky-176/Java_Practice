package Encapsulation;
// Encapsulation is ability of an object to hide its data and methods from rest.
// Mechanism of wrapping data and code into a single unit.
public class Student {
    int rolno;
    String name;
    boolean isAttend;

    public Student(int rolno){
        this.rolno=rolno;
    }

    public void SetAttendance(boolean att){
        isAttend=att;
        System.out.println("attendance over");
    }
    public boolean getAttendance(){
        return isAttend;
    }
}
