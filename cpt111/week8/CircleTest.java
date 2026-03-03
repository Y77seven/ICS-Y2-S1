public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

        Circle c2 = new Circle(2.0, -1.5, 3.0);
        System.out.println(c2);
        // -> Circle(center=(2.0, -1.5), radius=3.0)
        c2.setRadius(5.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());

        Circle c3 = new Circle(0.0, 0.0, -10.0);
        System.out.println(c3.getRadius());
        c3.setRadius(-2.0);
        System.out.println(c3.getRadius());
    }
}
