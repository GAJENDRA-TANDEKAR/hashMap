package hashMapDemo;

import java.util.HashMap;

public class StudentDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> student = new HashMap <>();
        student.put(1,"harsh");
        student.put(2,"raaj");
        student.put(3,"palash");
        student.put(4,"rohit");

        System.out.println(student);
    }
}


