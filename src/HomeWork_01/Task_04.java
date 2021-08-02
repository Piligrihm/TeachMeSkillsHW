package HomeWork_01;

public class Task_04 {
    public static void main(String[] args) {
        int pozitiveCount = 0; //  для положительных чисел
        int zeroCount = 0; // счетчик для нолей
        String numbers = "Введенные числа = "; // переменная для вывода в консоль всех чисел
        for (int i = 0; i < args.length; i++) {
            numbers = numbers + " " + args[i];
            if (Integer.parseInt(args[i]) != 0) {
                if (Integer.parseInt(args[i]) > 0) {
                    pozitiveCount++;
                }
            } else {
                zeroCount++;
            }
        }
        System.out.println(numbers + "\nКол-во положительных чисел = " + pozitiveCount
                + "\nКол-во нолей = " + zeroCount);

    }

}
