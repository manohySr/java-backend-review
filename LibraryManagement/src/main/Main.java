package LibraryManagement.src.main;

import LibraryManagement.src.model.*;
import LibraryManagement.src.service.*;

public class Main {
  public static void main(String[] args) {
    LibraryService libraryService = new LibraryService();

    // Add items to the library
    Book book = new Book("B001", "Java Programming", "John Doe");
    Magazine magazine = new Magazine("M001", "Tech Monthly", "January 2023");
    DVD dvd = new DVD("D001", "Java for Beginners", 120);

    libraryService.addItem(book);
    libraryService.addItem(magazine);
    libraryService.addItem(dvd);

    // Display items
    libraryService.displayItems();

    // Borrow an item
    libraryService.borrowItem("B001");

    // Display items again
    libraryService.displayItems();

    // Searching for an item
    libraryService.search("Java");
  }
}
