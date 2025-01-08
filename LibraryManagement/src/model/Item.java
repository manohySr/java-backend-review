package LibraryManagement.src.model;

public abstract class Item {
  private String id;
  private String title;
  private boolean borrowed;

  public Item(String id, String title) {
    this.id = id;
    this.title = title;
    this.borrowed = false;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isBorrowed() {
    return borrowed;
  }

  public void setBorrowed(boolean borrowed) {
    this.borrowed = borrowed;
  }

  public abstract void displayInfo();
}
