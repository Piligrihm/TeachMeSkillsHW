package HomeWork_01;

public class Task_07 {
    public static void main(String[] args) {
        int number = 112544; // кол-во программистов
        if (number % 10 == 0 || number % 10 > 4 && number % 10 < 10) {
            System.out.println(number + " программистов");
        }else if (number % 10 > 1  && number % 10 < 5){
            System.out.println(number + " программиста");
        }else {
            System.out.println(number + " программист");
        }


    }


}
