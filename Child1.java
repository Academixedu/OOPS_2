public class Child1 extends Parent {
    // Prepare Some Function and extend to Parent Class
    public void son2name(String name) {
        System.out.println("Son2: " + (name + getName("surya")));
    }

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.son2name("SJ");
    }
}
