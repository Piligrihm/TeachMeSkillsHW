package HomeWork_01;

public class Task_01 {
    public static void main(String[] args) {
        int var = 0;
        // проверяем положительное или отрицательное
        if (var >= 0) {
            System.out.println("Число не отрицательное!");
        } else {
            System.out.println("Число отрицательное!");
        }
        // проверяем кол-во знаков
        if (Math.abs(var) >= 0 && Math.abs(var) < 10){
            System.out.println("Число однозначное!");
        } else if (Math.abs(var) >= 10 && Math.abs(var) < 100){
            System.out.println("Число двухзначное!");
        } else if(Math.abs(var) >= 100){
            System.out.println("В числе три и более знака(ов)");
        }

    }
}