interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
