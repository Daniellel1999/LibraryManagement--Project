package library;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Journal class represents a journal publication.
 * A journal has a title, publisher, quantity, issue number and year of publication.
 */

public class Journal extends Publication {
    private int issueNumber;
    private int year;

    /**
     * Constructs a Journal object with the given title, publisher, quantity, issue number and year.
     *
     * @param title       the title of the journal
     * @param publisher   the publisher of the journal
     * @param qty         the quantity of the journal
     * @param issueNumber the issue number of the journal
     * @param year        the year the journal was published
     */
    public Journal(String title, String publisher, int qty, int issueNumber, int year) {
        super(title, publisher, qty);
        this.issueNumber = issueNumber;
        this.year = year;
    }

    /**
     * Returns the issue number of the journal.
     *
     * @return the issue number of the journal
     */
    public int getIssueNumber() {
        return issueNumber;
    }

    /**
     * Returns the year the journal was published.
     *
     * @return the year the journal was published
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the type of the publication, which is "Jrnl".
     *
     * @return the type of the publication
     */
    @Override
    public String getType() {
        return "Jrnl";
    }

    /**
     * Returns a string representation of the journal object.
     *
     * @return a string representation of the journal object
     */
    @Override
    public String toString() {
        return getPublicationID() + "-Jrnl   " + getTitle() + "(" + issueNumber + ")" +
                "\n          published by " + getPublication() + "(" + year + ")";
    }

    /**
     * Determines whether two journal objects are equal.
     * Two journal objects are considered equal if they have the same ID, title, publisher, quantity, issue number and year of publication.
     *
     * @param o the object to compare to this journal object
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Journal journal)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return issueNumber == journal.issueNumber && year == journal.year;
    }
}
