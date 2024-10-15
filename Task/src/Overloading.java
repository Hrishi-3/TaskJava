
public class Overloading {

    // with arguments and return value
    public int add(int a, int b) {
        return a + b;
    }

    // with arguments and without return value
    public void addAndPrint(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // without arguments and with return value
    public int add() {
        int a = 10, b = 20;
        return a + b;
    }

    // without arguments and without return value
    public void addAndPrint() {
        int a = 30, b = 40;
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        
        int result1 = o.add(5, 10);
        System.out.println("Result 1: " + result1);

        o.addAndPrint(15, 20);

        int result2 = o.add();
        System.out.println("Result 2: " + result2);

        o.addAndPrint();
    }
}

