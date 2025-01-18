package singleton.src.util;

/**
 * Database
 * Simulate a database
 */
public class Database {
  private static Database databaseInstance;

  private Database(String url) {
    System.out.println("Connecting to DB " + url);
  }

  public static Database connect(String url) {
    // I want to use this as a static method
    if (null == databaseInstance) {
      databaseInstance = new Database(url);
    }
    return databaseInstance;
  }
}
