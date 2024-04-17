public class Circle extends Shape {
    public Circle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public double CalcA() {
        double area = Math.PI * Math.pow(getX(), 2);
        System.out.println("The Circle has an area of: " + area);
        return area;
    }
}