public class Square extends GeometricObject implements Colorable{
  private double side;

  /**
   * Construct a Square with width and height
   */
  public Square(double side) {
    this.side = side;
  }

  /**
   * Return width
   */
  public double getSide() {
    return side;
  }

  /**
   * Set a new width
   */
  public void setWidth(double width) {
    this.side = side;
  }


  /**
   * Implement the getArea method in GeometricObject
   */
  @Override
  public double getArea() {
    return side * side;
  }

  /**
   * Implement the getPerimeter method in GeometricObject
   */
  @Override
  public double getPerimeter() {
    return 2 * (side);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Square r) {
      return (r.getSide() == getSide());
    }
    return false;
  }

  @Override
  public String toString() {
    return "Side Lengths: " + side;

  }

  @Override
  public void howToColor() {
    System.out.println("Colour all four sides");
  }
}
