interface printable {
    void print();
}

interface showable {
    void show();
}

class A7Interface implements printable, showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        A7Interface obj = new A7Interface();
        obj.print();
        obj.show();
    }
}