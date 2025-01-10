package LibraryManagement.src.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import LibraryManagement.src.interfaces.Searchable;
import LibraryManagement.src.model.Item;

/**
 * LibraryService
 * Service to manage the library's items
 */
public class LibraryService implements Searchable {
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

  @Override
  public void search(String keyword) {
    System.out.println("Searching for item containing: " + keyword);

    List<Item> itemFound = itemList.stream()
        .filter(item -> item.getTitle().contains(keyword))
        .collect(Collectors.toList());

    if (itemFound.isEmpty()) {
      System.out.println("No items found");
      return;
    }

    System.out.println("The item you're searching for is :");
    for (Item item : itemFound) {
      System.out.print("\t");
      item.displayInfo();
    }
  }
}
