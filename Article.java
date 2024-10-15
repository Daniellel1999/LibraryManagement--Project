package library;

import java.util.Objects;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Article class represents an article in a journal publication.
 * It is a subclass of the Journal class and inherits all of its attributes and methods.
 * An article has a name, an author, a URL address, a title, a publisher, a quantity, an issue number, and a year of publication.
 */
public class Article extends Journal {

    private String nameOfArticle;
    private Author author;
    private String URLAddress;


    /**
     * Constructs an article object with the given parameters.
     *
     * @param title         the title of the journal publication
     * @param publisher     the publisher of the journal publication
     * @param qty           the quantity of the journal publication
     * @param issueNumber   the issue number of the journal publication
     * @param year          the year of publication of the journal publication
     * @param nameOfArticle the name of the article
     * @param author        the author of the article
     * @param URLAddress    the URL address of the article
     */
    public Article(String title, String publisher, int qty, int issueNumber, int year, String nameOfArticle, Author author, String URLAddress) {
        super(title, publisher, qty, issueNumber, year);
        this.nameOfArticle = nameOfArticle;
        this.author = author;
        this.URLAddress = URLAddress;
    }

    /**
     * Returns the type of the publication, which is "Artl".
     *
     * @return the type of the publication
     */
    @Override
    public String getType() {
        return "Artl";
    }

    /**
     * Returns a string representation of the article object.
     *
     * @return a string representation of the article object
     */
    @Override
    public String toString() {
        return getPublicationID() + "-Artl   " + "'" + nameOfArticle +
                "', by " + author +
                "\n          " + getTitle() + "(" + getIssueNumber() + ")\n          " +
                "published by " + getPublication() + "(" + getYear() + ")\n          "
                + URLAddress;
    }

    /**
     * Determines whether two article objects are equal.
     * Two article objects are considered equal if they have the same name, author, URL address, title, publisher, quantity, issue number, and year of publication.
     *
     * @param o the object to compare to this article object
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Article article)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return Objects.equals(nameOfArticle, article.nameOfArticle) && Objects.equals(author, article.author) && Objects.equals(URLAddress, article.URLAddress);
    }

}
