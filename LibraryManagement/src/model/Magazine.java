package LibraryManagement.src.model;

public class Magazine extends Item {
  private String publishedDate;

  public String getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
  }

  public Magazine(String id, String title, String publishedDate) {
    super(id, title);
    this.publishedDate = publishedDate;
  }

  @Override
  public void displayInfo() {
    System.out.println("Magazine [ID: " + getId() + ", Title: " + getTitle() +
        ", Published Date: " + publishedDate + ", Borrowed: " + isBorrowed() + "]");
  }
}
