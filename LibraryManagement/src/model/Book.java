package LibraryManagement.src.model;

public class Book extends Item {
  private String author;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book(String id, String title, String author) {
    super(id, title);
    this.author = author;
  }

  @Override
  public void displayInfo() {
    System.out.println("Book [ID: " + getId() + ", Title: " + getTitle() +
        ", Author: " + author + ", Borrowed: " + isBorrowed() + "]");
  }
}
