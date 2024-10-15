package library;

import java.util.Objects;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Author class represents an author of a publication.
 * An author has a name and an email address.
 */
public class Author {
    private String name;
    private String email;

    /**
     * Constructs an author object with the given name and email address.
     *
     * @param name  the name of the author
     * @param email the email address of the author
     */
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Returns a string representation of the author object.
     *
     * @return a string representation of the author object
     */

    @Override
    public String toString() {
        return name + " at " + email;
    }

    /**
     * Determines whether two author objects are equal.
     * Two author objects are considered equal if they have the same name and email address.
     *
     * @param o the object to compare to this author object
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Author author)) {
            return false;
        }
        return Objects.equals(name, author.name) && Objects.equals(email, author.email);
    }
}
