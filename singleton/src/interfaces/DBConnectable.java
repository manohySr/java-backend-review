package singleton.src.interfaces;

import singleton.src.util.Database;

public interface DBConnectable {
  Database connect(String url);
}
