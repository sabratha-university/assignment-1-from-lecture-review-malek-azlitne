public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}