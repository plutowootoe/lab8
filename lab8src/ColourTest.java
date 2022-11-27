public class ColourTest {

    public static void main(String[] args) {
        GeometricObject[] poop = new GeometricObject[5];

        for (GeometricObject geometricObject : poop) {
            if (geometricObject instanceof Colorable) {
                System.out.println("How to Color: ");
                ((Colorable) geometricObject).howToColor();
            }
        }
    }
}