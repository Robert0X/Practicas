public class Square extends Shape {
    public Square(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public double CalcA() {
        int area = x * x;
        System.out.println("Square area is " + area);
        return area;
    }
}
