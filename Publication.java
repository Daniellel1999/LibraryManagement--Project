package library;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Publication class represents a publication that can be found in a library.
 * It contains information about the title, publisher, quantity, and unique identifier of the publication.
 */

public abstract class Publication {
    private String title;
    private String publication;
    private static int counter = 10;
    private int qty;
    private final int publicationID;

    /**
     * Constructs a Publication object with the given title, publisher, and quantity.
     *
     * @param title     the title of the publication
     * @param publisher the publisher of the publication
     * @param qty       the quantity of the publication
     */
    public Publication(String title, String publisher, int qty) {
        this.title = title;
        this.qty = qty;
        this.publication = publisher;
        this.publicationID = counter++;
    }

    /**
     * Returns the title of the publication.
     *
     * @return the title of the publication
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the publisher of the publication.
     *
     * @return the publisher of the publication
     */

    public String getPublication() {
        return publication;
    }

    /**
     * Returns the unique identifier of the publication.
     *
     * @return the unique identifier of the publication
     */
    public int getPublicationID() {
        return publicationID;
    }

    /**
     * Returns the quantity of the publication.
     *
     * @return the quantity of the publication
     */
    public int getQty() {
        return qty;
    }

    /**
     * Sets the quantity of the publication.
     *
     * @param qty the new quantity of the publication
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * Returns the type of the publication, which is "Publication".
     *
     * @return the type of the publication
     */
    public String getType() {
        return "Publication";
    }

    /**
     * Returns a string representation of the publication object.
     *
     * @return a string representation of the publication object
     */

    @Override
    public String toString() {
        return "'" + title + "'" +
                " published by " + publication;
    }

    /**
     * Determines whether two publication objects are equal.
     * Two publication objects are considered equal if they have the same title, publisher and quantity.
     *
     * @param o the object to compare to this book object
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Publication that)) {
            return false;
        }
        return qty == that.qty && publicationID == that.publicationID
                && title.equals(that.title)
                && publication.equals(that.publication);
    }
}
