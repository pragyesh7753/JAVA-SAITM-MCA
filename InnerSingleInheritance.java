class GrandParents {
    void gp() {
        System.out.println("Hello from Grandparents");
    }
}

class Parents extends GrandParents {
    void gp() {
        super.gp();
        System.out.println("Hello from Parents");
    }
}

class InnerSingleInheritance {
    public static void main(String[] args) {
        Parents p1 = new Parents();
        p1.gp();
    }
}