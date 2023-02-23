package review;

class A {
    A() {
        System.out.println("Constructor of A!");
    }
}

class B{
    B() {
        System.out.println("Constructor of B!");
    }
}

class C extends A {
    B obj = new B();
}

public class ConstructorDemo {
    public static void main(String[] args) {
        C object = new C();
    }
}

