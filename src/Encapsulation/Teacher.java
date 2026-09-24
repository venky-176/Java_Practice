package Encapsulation;

public class Teacher {
    static void main(String[] args) {
        Student st= new Student(121);
        st.SetAttendance(true);
        System.out.println(st.getAttendance());
    }
}
