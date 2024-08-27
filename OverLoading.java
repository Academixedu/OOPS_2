public class OverLoading{
    public void load(){
        System.out.println("hello");
    }
    public  void load(int w){
        System.out.println(w);
    }
    public void load(String s,int w){
        System.out.println(s+" "+w);
    }
    public static void main(String[] args) {
        OverLoading v=new OverLoading();
        v.load();
        v.load(12);
        v.load("arbaz", 25);

}
}
// Prepare an Example to show OverLoading Concept