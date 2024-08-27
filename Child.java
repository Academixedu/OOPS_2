public class Child extends Parent {
    // Prepare Some Functions in Child Class and Extend it to Parent Class
    public void sonname(String name) {
        System.out.println("Son Name: " + name + " " + getName("John"));
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.sonname("surya");
    }
}
