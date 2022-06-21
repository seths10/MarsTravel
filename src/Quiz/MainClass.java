package Quiz;

public class MainClass {
    static void overloadedMethod(A a){
        System.out.println("ONE");
    }
    static void overloadedMethod(B b){
        System.out.println("TWO");
    }
    static void overloadedMethod(Object obj){
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        C c = new C();
        overloadedMethod(c);
    }
}
