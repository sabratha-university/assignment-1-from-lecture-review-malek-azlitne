public class Circle extends Shape implements Movable, Adjustable {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void moveUp() {
        y -= 1;
    }

    @Override
    public void moveDown() {
        y += 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotating circle by " + angle + " degrees");
    }
}