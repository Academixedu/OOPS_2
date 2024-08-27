
public class OverLoading {
    // Prepare an Example to show OverLoading Concept
    OverLoading() {
        System.out.println("No Argument Constructor");
    }

    OverLoading(int a) {
        System.out.println("One Argument Constructor with int value: " + a);
    }

    OverLoading(int a, int b) {
        System.out.println("two vlaues Argument Constructors: " + a + "  : " + b);
    }

    OverLoading(int a, int b, int c) {
        System.out.println("three vlaues Argument Constructors : " + a + " :" + b + " :" + c);
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();// no argu
        OverLoading obj2 = new OverLoading(10);// one argu
        OverLoading obj3 = new OverLoading(10, 20);// two argu
        OverLoading obj4 = new OverLoading(10, 20, 30);// three argu
    }
}

