class Shape {
  void calculateArea() {
    System.out.println("calculateArea...");
  }
}

class Circle extends Shape {
  private int radius;

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  void calculateArea() {
    double result = Math.PI * Math.pow(radius, 2);
    System.out.println("The area is: " + result + "m2");
  }
}

class Rectangle extends Shape {
  private int length;
  private int width;

  public void setLength(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  void calculateArea() {
    double result = length * width;

    System.out.println("The area is: " + result + "m2");
  }
}

public class main {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.setLength(5);
    r.setWidth(5);
    r.calculateArea();

    Circle c = new Circle();
    c.setRadius(5);
    c.calculateArea();
  }
}
