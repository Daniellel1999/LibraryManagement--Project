package library;

import java.util.Scanner;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

public class MainLibrary {

    public static void main(String[] args) {

        //Initializes an array of Student
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");

        //Initializes an array of Authors
        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

        //Initializes an array of Publications
        publications[0] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                2, authors[0], "Tay Hohoff", 1960);
        publications[1] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020,
                "Yanshuf Aezim", authors[5],
                "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
        publications[4] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021,
                "Alufot Eropa le-Mathematica", authors[4],
                "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
        publications[6] = new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1], "Maxwell Perkins", 1925);
        publications[7] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[8] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2], "", 2002);
        publications[10] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022,
                "AI (artificial intelligence) is upgrading", authors[3],
                "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
        publications[12] = new Journal("Nature", "Springer Nature",
                5, 590, 2021);

        //Sorts the publication array
        Publication[] sortedArr = sortPublications(publications);

        while (true) {
            //The program prompts the user to input a student number and a publication number to simulate a loan.
            System.out.println("Welcome to the library. Start loan:");
            System.out.println("Insert student number [0,3]: ");
            Scanner scanner = new Scanner(System.in);
            int studentNum = scanner.nextInt();

            //If the user enters -1 as the student number, the program prints a report on the library's status.
            //The library status includes all the publications sorted by their ID, type, quantity, and title.
            if (studentNum == -1) {
                System.out.println("\nReport on library status: ");
                System.out.println("============================================================");
                for (int i = 0; i < publications.length; i++) {
                    if (sortedArr[i] == null) {
                        break;
                    }
                    System.out.println(sortedArr[i].getPublicationID() + "-" + sortedArr[i].getType() + ", qty: " + sortedArr[i].getQty() + ", '" + sortedArr[i].getTitle() + "'");
                }
                break;
            }

            System.out.println("Insert publication number [10,22]: ");
            int publicationNum = scanner.nextInt();

            Student student = students[studentNum];
            Publication publication = publications[publicationNum - 10];

            //If the student has already loaned three publications, the program prints a message indicating that the loan failed.
            if (student.getLoanedNumber() >= 3) {
                System.out.println("\nLoad report: Loan failed - This student has already loaned 3 publications.");
                System.out.println("Student number: " + student.getStudentNum() + "    Name: " + student.getStudentName() + ", Loaned-publications:" + student.getLoanedNumber());
                System.out.println("\nList of loaned publications:");
                for (Publication p : student.getPublications()) {
                    if (p != null) {
                        System.out.println(p);
                    }
                }
                continue;
            }

            //If the publication is out of stock, the program prints a message indicating that the loan failed.
            if (publication.getQty() == 0) {
                System.out.println("\nLoad report: Loan failed - This publication is out of stock.");
                System.out.println(publication.getPublicationID() + "-" + publication.getType() + ", qty: " + publication.getQty() + ", '" + publication.getTitle() + "'\n\n");
                continue;
            }

            //Loans the publication to the student
            student.addPublicationLoaned(publication);

            //Updates the publication's quantity
            publication.setQty(publication.getQty() - 1);

            //Prints the loan report
            System.out.println("\nLoan Report:");
            System.out.println("Student number: " + student.getStudentNum() + "    Name: " + student.getStudentName() + ", Loaned-publications:" + student.getLoanedNumber());
            System.out.println("\nList of loaned publications:");
            for (Publication p : student.getPublications()) {
                if (p != null) {
                    System.out.println(p);
                }
            }
            System.out.println("\nSuccessful loan of:");
            System.out.println(publication.getPublicationID() + "-" + publication.getType() + ", qty: " + publication.getQty() + ", '" + publication.getTitle() + "'\n\n");
        }
    }

    public static Publication[] libraryMethod (Publication[] publications){
        while (true) {
            //The program prompts the user to input a student number and a publication number to simulate a loan.
            System.out.println("Welcome to the library. Start loan:");
            System.out.println("Insert student number [0,3]: ");
            Scanner scanner = new Scanner(System.in);
            int studentNum = scanner.nextInt();

            //If the user enters -1 as the student number, the program prints a report on the library's status.
            //The library status includes all the publications sorted by their ID, type, quantity, and title.
            if (studentNum == -1) {
                System.out.println("\nReport on library status: ");
                System.out.println("============================================================");
                for (int i = 0; i < publications.length; i++) {
                    if (sortedArr[i] == null) {
                        break;
                    }
                    System.out.println(sortedArr[i].getPublicationID() + "-" + sortedArr[i].getType() + ", qty: " + sortedArr[i].getQty() + ", '" + sortedArr[i].getTitle() + "'");
                }
                break;
            }

            System.out.println("Insert publication number [10,22]: ");
            int publicationNum = scanner.nextInt();

            Student student = students[studentNum];
            Publication publication = publications[publicationNum - 10];

            //If the student has already loaned three publications, the program prints a message indicating that the loan failed.
            if (student.getLoanedNumber() >= 3) {
                System.out.println("\nLoad report: Loan failed - This student has already loaned 3 publications.");
                System.out.println("Student number: " + student.getStudentNum() + "    Name: " + student.getStudentName() + ", Loaned-publications:" + student.getLoanedNumber());
                System.out.println("\nList of loaned publications:");
                for (Publication p : student.getPublications()) {
                    if (p != null) {
                        System.out.println(p);
                    }
                }
                continue;
            }

            //If the publication is out of stock, the program prints a message indicating that the loan failed.
            if (publication.getQty() == 0) {
                System.out.println("\nLoad report: Loan failed - This publication is out of stock.");
                System.out.println(publication.getPublicationID() + "-" + publication.getType() + ", qty: " + publication.getQty() + ", '" + publication.getTitle() + "'\n\n");
                continue;
            }

            //Loans the publication to the student
            student.addPublicationLoaned(publication);

            //Updates the publication's quantity
            publication.setQty(publication.getQty() - 1);

            //Prints the loan report
            System.out.println("\nLoan Report:");
            System.out.println("Student number: " + student.getStudentNum() + "    Name: " + student.getStudentName() + ", Loaned-publications:" + student.getLoanedNumber());
            System.out.println("\nList of loaned publications:");
            for (Publication p : student.getPublications()) {
                if (p != null) {
                    System.out.println(p);
                }
            }
            System.out.println("\nSuccessful loan of:");
            System.out.println(publication.getPublicationID() + "-" + publication.getType() + ", qty: " + publication.getQty() + ", '" + publication.getTitle() + "'\n\n");
        }
    }

    public static Publication[] sortPublications(Publication[] publications) {

        //This creates a new array of Publication objects with the same length as the input array publications
        Publication[] sortedPublications = new Publication[publications.length];

        //This variable is used to keep track of the current index in the sortedPublications array that is being filled
        int index = 0;

        // Checks if the element is an instance of Book.
        // If so- it is added to sortedPublication array.
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] instanceof Book) {
                sortedPublications[index] = publications[i];
                index++;
            }
        }

        // Checks if the element is an instance of Journal and not instance of Article.
        // If so- it is added to sortedPublication array.
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] instanceof Journal && !(publications[i] instanceof Article)) {
                sortedPublications[index] = publications[i];
                index++;
            }
        }

        // Checks if the element is an instance of Article.
        // If so- it is added to sortedPublication array.
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] instanceof Article) {
                sortedPublications[index] = publications[i];
                index++;
            }
        }

        // Checks if the element is an instance of Encyclopedia.
        // If so- it is added to sortedPublication array.
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] instanceof Encyclopedia) {
                sortedPublications[index] = publications[i];
                index++;
            }
        }

        // Checks if the element is an instance of Publication but not instance of Book, Journal, Article of Encyclopedia.
        // If so- it is added to sortedPublication array.
        for (int i = 0; i < publications.length - 1; i++) {
            if (publications[i] instanceof Publication
                    && !(publications[i] instanceof Book)
                    && !(publications[i] instanceof Journal)
                    && !(publications[i] instanceof Article)
                    && !(publications[i] instanceof Encyclopedia)) {
                sortedPublications[index] = publications[i];
                index++;
            }
        }

        // Returns the sorted array.
        return sortedPublications;
    }
}


