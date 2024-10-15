package library;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

public class MainPublication2 {

    public static void main(String[] args) {

        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];

        //Initializes an array of Authors
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

        //Prints the sorted list of the publications in the library
        System.out.println("List of publication sorted by 'Book', 'Journal', 'Article' and 'Encyclopedia':");
        System.out.println("============================================================");

        Publication[] sortedArr = sortPublications(publications);

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] != null) {
                System.out.println(sortedArr[i]);
            }
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