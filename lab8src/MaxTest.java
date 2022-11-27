public class MaxTest {

    GeometricObject circle = new Circle(2);
    GeometricObject rectangle = new Rectangle(4,5);

    public static void main(String[] args){
        GeometricObject circle = new Circle(2);
        GeometricObject rectangle = new Rectangle(4,5);
        GeometricObject circle1 = new Circle(10);
        GeometricObject rectangle2 = new Rectangle(2,1);

        System.out.print(GeometricObject.max(circle,rectangle));
        System.out.print(GeometricObject.max(circle1,rectangle2));

    }
}