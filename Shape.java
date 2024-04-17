public abstract class Shape {
    int x, y;
    String color;

    public Shape(int x, int y, String color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract double CalcA();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}