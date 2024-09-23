//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    //ЗДЕСЬ ДЕЛАЮ ДРУГИЕ МЕТОДЫ



    //ЗДЕСЬ НАЧИНАЕТСЯ метод MAIN
    public static void main(String[] args) {
        //task1
/*Реализуйте метод, который получает в качестве параметра год,
проверяет, является ли он високосным, и выводит результат в консоль.
 */
        int year = 2020;
        checkLeapAndPrint(year);


//task3
        /*
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:  2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
*/
    } //тут конец метода main

    private static void checkLeapAndPrint(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "год является високосным.");
        } else {
            System.out.println(year + "год не является високосным.");
        }
    }
}