import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
/*Реализуйте метод, который получает в качестве параметра год,
проверяет, является ли он високосным, и выводит результат в консоль.
 */
        int year = 2020;
        checkLeapAndPrint(year);
        //task2
        int os = 1;
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 0;
        printReccomendVerApp(os, clientDeviceYear, currentYear);


//task3
        //доработать код, а именно написать метод, который на вход принимает
        // дистанцию и возвращает итоговое количество дней доставки.
        int deliveryDistance = 25;
        getDistanceAndPrintDay(deliveryDistance);
    } //тут конец метода main

    private static void getDistanceAndPrintDay(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:  2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    private static void printReccomendVerApp(int os, int clientDeviceYear, int currentYear) {
        if (os == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os > 1 || os < 0 || clientDeviceYear > currentYear || clientDeviceYear < 2000) {
            System.out.println("Ошибка при введении данных");
        }
    }

    private static void checkLeapAndPrint(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "год является високосным.");
        } else {
            System.out.println(year + "год не является високосным.");
        }
    }
}