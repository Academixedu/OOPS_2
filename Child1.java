public class Child1 extends Parent{
    public void details1(String name2,int id2){
        System.out.println("Name is: "+name2);
        System.out.println("Id is: "+id2);
    }
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.details1("Revathi Vinnakota ",18);
        c1.p1("Revathi v ",52);
    }
}
