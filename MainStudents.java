package library;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

public class MainStudents {
    public static void main(String[] args) {
        Student[] students = new Student[100];

        //Initializes an array of Students
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");

        //Prints the list of the students
        listStudents(students);

    }

    public static void listStudents(Student[] students) {
        System.out.println("List of students: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

}