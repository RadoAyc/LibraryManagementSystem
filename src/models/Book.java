package models;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isLoaned;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isLoaned = false;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isLoaned=" + isLoaned + "]";
    }
}
