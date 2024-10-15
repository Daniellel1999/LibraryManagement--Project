package library;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Book class represents a book publication.
 * A book has a title, publisher, quantity, author, editor, and year of publication.
 */

public class Book extends Publication {

    private Author author;
    private String editor;
    private int year;

    /**
     * Constructs a book object with the given title, publisher, quantity, author, editor, and year.
     *
     * @param title     the title of the book
     * @param publisher the publisher of the book
     * @param qty       the quantity of the book
     * @param author    the author of the book
     * @param editor    the editor of the book
     * @param year      the year of publication of the book
     */
    public Book(String title, String publisher, int qty, Author author, String editor, int year) {
        super(title, publisher, qty);
        this.author = author;
        if (editor == "") {
            this.editor = "unknown";
        } else {
            this.editor = editor;
        }
        this.year = year;
    }

    /**
     * Returns the type of the publication, which is "Book".
     *
     * @return the type of the publication
     */
    @Override
    public String getType() {
        return "Book";
    }

    /**
     * Returns a string representation of the book object.
     *
     * @return a string representation of the book object
     */

    @Override
    public String toString() {
        return getPublicationID() + "-Book   " + "'" + getTitle() +
                "' by " + author +
                "\n          published by " + getPublication() +
                " edited by " + editor + "(" + year + ")";
    }

    /**
     * Determines whether two book objects are equal.
     * Two book objects are considered equal if they have the same title, publisher, quantity, author, editor, and year of publication.
     *
     * @param o the object to compare to this book object
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book book)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return year == book.year && author.equals(book.author) && editor.equals(book.editor);
    }
}
