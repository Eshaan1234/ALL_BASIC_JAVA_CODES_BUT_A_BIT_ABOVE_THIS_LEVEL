public class OverloadExample {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println(obj.sum(5, 10));
        System.out.println(obj.sum(5, 10, 15));
    }
}
