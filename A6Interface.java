interface printable {
    void print();
}

public class A6Interface implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6Interface obj = new A6Interface();
        obj.print();
    }
}
