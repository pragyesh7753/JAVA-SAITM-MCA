
interface GrandParents {
    void gp();
}

interface Parents {
    void p();
}

class Child implements GrandParents, Parents {

    public void gp() {
        System.out.println("Hello from Grandparents");
    }

    public void p() {
        System.out.println("Hello from Prents");
    }
}

interface MultipleInheritance {
    public static void main(String[] args) {
        Child p1 = new Child();
        p1.gp();
        p1.p();
    }
}