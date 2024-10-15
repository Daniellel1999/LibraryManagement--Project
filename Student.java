package library;

import java.util.Arrays;
import java.util.Objects;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Student class represents a library user who can borrow publications.
 * Each student has a name, a unique ID number, and can borrow up to 3 publications.
 */
public class Student {
    private String studentName;
    private static int studentNumber = 0;
    private final int studentIDNumber;
    private int loanedNumber = 0;
    private Publication[] publications = new Publication[3];

    /**
     * Creates a new Student object with the given name and assigns a unique ID number.
     *
     * @param studentName the name of the student
     */
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentIDNumber = studentNumber++;
    }

    /**
     * Adds a publication to the student's list of loaned publications, up to a maximum of 3.
     *
     * @param publication the publication to be added
     */
    public void addPublicationLoaned(Publication publication) {
        for (int i = 0; i < 3; i++) {
            if (publications[i] == null) {
                publications[i] = publication;
                break;
            }
        }
        loanedNumber++;
    }

    /**
     * Returns the number of publications currently loaned by the student.
     *
     * @return the number of loaned publications
     */
    public int getLoanedNumber() {
        return loanedNumber;
    }

    /**
     * Returns the unique ID number of the student.
     *
     * @return the ID number of the student
     */
    public int getStudentNum() {
        return studentIDNumber;
    }

    /**
     * Returns the name of the student.
     *
     * @return the name of the student
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Returns an array of the publications currently loaned by the student.
     *
     * @return an array of loaned publications
     */
    public Publication[] getPublications() {
        return publications;
    }

    /**
     * Returns a string representation of the student, including their unique ID number, name, and number of loaned publications.
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Student number: " + studentIDNumber + "   " +
                "Name: " + studentName +
                ", Loaned publication number: " + loanedNumber;
    }

    /**
     * Determines whether two student objects are equal.
     * Two student objects are considered equal if they have the same ID number,
     * name, and have loaned the same publications.
     *
     * @param o the object to compare to this book object
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return studentIDNumber == student.studentIDNumber
                && loanedNumber == student.loanedNumber
                && Objects.equals(studentName, student.studentName)
                && Arrays.equals(publications, student.publications);
    }
}
