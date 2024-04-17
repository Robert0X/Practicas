import java.util.Scanner;

public class Main {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        Shape square = new Square(5, 0, "red");
        Shape circle = new Circle(3, 1, "blue");
        Shape triangle = new Triangle(5, 6, "green");

        square.CalcA();
        circle.CalcA();
        triangle.CalcA();

        cin.close();
    }
}