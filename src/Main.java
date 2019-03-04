public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        circle.setRadius(25);
        cylinder.setHeight(10);
        cylinder.setRadius(20);

        System.out.println(circle);
        System.out.println("Area of circle is " + circle.getArea());
        System.out.println("Volume of cylinder is " + cylinder.getVolume());

    }
}
