//Calculate the area and circumference of a circle for a given radius using Math.PI

package challenges;

public class Challenge73 {
  public static void main(String[] args) {
    AreaOfCircle areaOfCircle = new AreaOfCircle(5.0);
    System.out.println(areaOfCircle);
  }

  static class AreaOfCircle {
    double area;
    double circumference;
    double radius;

    AreaOfCircle(double radius){
      this.radius = radius;
      area = (Math.PI) * radius * radius;
      circumference = 2 * (Math.PI) * radius;
    }

    @Override
    public String toString() {
      return "Area of a Circle " + area + " and Circumference of a Circle " + circumference;
    }
  }
}
