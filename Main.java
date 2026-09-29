import java.util.Scanner;

class Student {

    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double javaScore;
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create one Student object
        Student st = new Student();
        Student sd = new Student();

        // Read and store all values in the object
        st.id = sc.nextInt();
        st.name = sc.next();
        st.course = sc.next();
        st.javaScore = sc.nextDouble();

        sd.id = sc.nextInt();
        sd.name = sc.next();
        sd.course = sc.next();
        sd.javaScore = sc.nextDouble();

        

        
        System.out.println("Student Profile -- 1");
        System.out.println("ID: " + st.id);
        System.out.println("Name: " + st.name);
        System.out.println("Course: " + st.course);
        System.out.println("Java Score: " + st.javaScore);

        System.out.println("Student Profile -- 2");
        System.out.println("ID: " + sd.id);
        System.out.println("Name: " + sd.name);
        System.out.println("Course: " + sd.course);
        System.out.println("Java Score: " + sd.javaScore);
    }
}