package javaTest;

class TEST {
    int instance = 10; // Biến instance

    public void method() {
        int local = 5; // Biến local
        System.out.println("Instance variable: " + instance);
        System.out.println("Local variable: " + local);
    }
}

public class Test {
    public static void main(String[] args) {
        TEST test = new TEST(); // Tạo đối tượng của lớp TEST
        test.method(); // Gọi phương thức method() từ đối tượng test
    }
}