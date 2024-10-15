package library;

import java.util.Objects;

//Assignment Number 2
//Author- Danielle Elnekave
//ID: 208267096

/**
 * The Encyclopedia class represents an encyclopedia publication.
 * An encyclopedia has a title, publisher, quantity, volume and editor.
 */
public class Encyclopedia extends Publication {

    private int volume;
    private String editor;

    /**
     * Constructs an Encyclopedia object with the given title, publisher, quantity, editor, and volume.
     *
     * @param title     the title of the encyclopedia
     * @param publisher the publisher of the encyclopedia
     * @param qty       the quantity of the encyclopedia
     * @param editor    the editor of the encyclopedia
     * @param volume    the volume of the encyclopedia
     */
    public Encyclopedia(String title, String publisher, int qty, String editor, int volume) {
        super(title, publisher, qty);
        this.volume = volume;
        if (editor == "") {
            this.editor = "unknown";
        } else {
            this.editor = editor;
        }
    }

    /**
     * Returns the type of the publication, which is "Ency".
     *
     * @return the type of the publication
     */
    @Override
    public String getType() {
        return "Ency";
    }

    /**
     * Returns a string representation of the encyclopedia object.
     *
     * @return a string representation of the encyclopedia object
     */
    @Override
    public String toString() {
        return getPublicationID() + "-Ency   " + getTitle() + " vol. " + volume +
                "\n          published by " + getPublication() +
                " edited by " + editor;
    }

    /**
     * Determines whether two encyclopedia objects are equal.
     * Two encyclopedia objects are considered equal if they have the same ID, title, publisher, quantity, volume, and editor.
     *
     * @param o the object to compare to this encyclopedia object
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Encyclopedia that)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return volume == that.volume && Objects.equals(editor, that.editor);
    }
}
