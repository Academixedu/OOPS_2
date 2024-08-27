public class Child extends Parent{
    public void details(String name1,int id1){
        System.out.println("New name: "+name1+"New id: "+id1);
    }
    public static void main(String[] args) {
        Child c=new Child();
        c.p1("revathi ",1);
        c.details("Revathi ",11);
    }

}
