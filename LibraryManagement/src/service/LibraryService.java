package LibraryManagement.src.service;

import java.util.ArrayList;

import LibraryManagement.src.model.Item;

/**
 * LibraryService
 * Service to manage the library's items
 */
public class LibraryService {
  private ArrayList<Item> itemList;

  public LibraryService() {
    this.itemList = new ArrayList<>();
  }

  public void addItem(Item i) {
    itemList.add(i);
  }

  public void borrowItem(String id) {
    Item itemToBorrow = itemList.stream()
        .filter(item -> item.getId().equals(id))
        .findFirst()
        .orElse(null);

    if (itemToBorrow != null) {
      itemToBorrow.setBorrowed(true);
      System.out.println(itemToBorrow.getTitle() + " has been borrowed.");
    } else {
      System.out.println("Item with ID " + id + " not found.");
    }
  }

  public void displayItems() {
    if (itemList.isEmpty()) {
      System.out.println("No items available.");
      return;
    }

    System.out.println("Here are all the items in our library");
    for (Item item : itemList) {
      item.displayInfo();
    }
  }
}
