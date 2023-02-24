package review;
class SingletonExample {
    static SingletonExample s;

    private SingletonExample() {}

    public static SingletonExample createInstance() {
        if(s == null)
            s = new SingletonExample();
        return s;
    }
    
    public void testPrint() {
        System.out.println("In singleton class.");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonExample s = SingletonExample.createInstance();
        s.testPrint();
    }
}