public class OverLoading{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        OverLoading ol=new OverLoading();
        System.out.println("addition of a,b is "+ol.add(10,20));
        System.out.println("addition of a,b,c is "+ol.add(10,20,30));
    }
}