interface showable {
    void show();

    interface message {
        void msg();
    }
}

public class TestNestedInterface implements showable.message {
    public void msg() {
        System.out.println("Hello Nested Interface");
    }

    public static void main(String[] args) {
        showable.message obj = new TestNestedInterface();
        obj.msg();
    }

}
