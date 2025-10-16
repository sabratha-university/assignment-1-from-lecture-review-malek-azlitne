public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5, 5, 2.5);

        c.draw();            // يرسم الدائرة
        c.move(3, 2);        // يحركها باستخدام move من Shape
        c.moveUp();          // يحركها للأعلى
        c.moveRight();       // يحركها لليمين
        c.resize(2.0);       // يغير حجمها
        c.rotate(90);        // يدورها
        c.draw();            // يرسمها بعد التعديلات
    }
}