public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle();
        System.out.print("PI: ");
        circle1.setPI(3.14);
        System.out.println(circle1.getPI());
        System.out.print("Radius: ");
        circle1.setRadius(4);
        System.out.println(circle1.getRadius());

        System.out.println("Area: " + Circle.area());
        System.out.print("Circumference: ");
        Circle.circumference();
    }
}