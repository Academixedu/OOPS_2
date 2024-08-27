public class child1 extends parent {
    // Prepare Some Function and extend to Parent Class
    public void son2name(String name) {
        System.out.println("Son2: " + (name + getName("T")));
    }

    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.son2name("Varun");
    }
}
