public class child extends parent {
    // Prepare Some Functions in Child Class and Extend it to Parent Class
    public void sonname(String name) {
        System.out.println("Son Name: " + name + " " + getName("T"));
    }

    public static void main(String[] args) {
        child ch = new child();
        ch.sonname("Karthik");
    }
}
