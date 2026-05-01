class Demo {
    int data;
    Demo(int d) { data = d; }
}

public class CallByValueReference {
    static void changeValue(int x) {
        // x = x + 10; // won't affect original - parameter is passed by value
    }

    static void changeObject(Demo obj) {
        obj.data = obj.data + 10; // affects original
    }

    public static void main(String[] args) {
        int a = 5;
        changeValue(a);
        System.out.println("After call by value: " + a);

        Demo d = new Demo(5);
        changeObject(d);
        System.out.println("After call by reference-like: " + d.data);
    }
}

