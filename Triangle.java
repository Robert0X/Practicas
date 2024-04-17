public class Triangle extends Shape {

    public Triangle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public double CalcA() {
        int area = (x * y) / 2;
        System.out.println("The Triangle has an area of: " + area);
        return area;
    }

}