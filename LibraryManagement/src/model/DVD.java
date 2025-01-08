package LibraryManagement.src.model;

public class DVD extends Item {
  private int duration;

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public DVD(String id, String title, int duration) {
    super(id, title);
    this.duration = duration;
  }

  @Override
  public void displayInfo() {
    System.out.println("DVD [ID: " + getId() + ", Title: " + getTitle() +
        ", Duration: " + duration + " mins, Borrowed: " + isBorrowed() + "]");
  }
}
