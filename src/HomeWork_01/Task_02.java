package HomeWork_01;

public class Task_02 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 2;
        if (a > (b + c) || b > (a + c) || c > (a + b)) {
            System.out.println("Треугольник не существует!");
        } else {
            System.out.println("Треугольник существует!");
        }
    }
}

