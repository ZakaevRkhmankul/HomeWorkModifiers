public class Circle {
    //  Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
// жана circumference деген статик методдору болсун.
// areaны табуу учун: PI * (radius * radius)
// circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
    // Pole
    private double PI;
    private double radius;

    // Constructor
    public Circle() {
    }

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    //Getter and Setter
    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methods
    public static double area() {
        double PI = 3.14;
        double radius = 4;
        double area = PI * (radius * radius);
        return area;
    }

    public static void circumference() {
        double PI = 3.14;
        double radius = 4;
        double circumference = PI * 2 * radius;
        System.out.println(circumference);

    }

}
