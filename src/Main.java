import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
package



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean rab = true;

        System.out.print(" Для выхода введите \"0\" \n");
        while (rab) {
            System.out.println("\n\nВведите номер задания:");
            int zadan = in.nextInt();
            switch (zadan) {
                case 0: {
                    System.out.println("\n\nПрограмма завершена!\nСпасибо за использование!!");
                    rab = false;
                    break;
                }
                case 1: { task1(); break;}
                case 2: { task2(); break; }
                case 3: { task3(); break; }
                case 4: { task4(); break; }
                case 5: { task5(); break; }
                case 6: { task6(); break; }
                case 7: { task7(); break; }
                case 8: { task8(); break; }
                case 9: { task9(); break; }
                case 10: { task10(); break; }
                default: System.out.println("Введено некорректное значение!");
            }
        }
        in.close();
    }

    static void task1() {
        Scanner in = new Scanner(System.in);
        boolean jobTask1 = true;
        String regex = "^[АВЕКМНОРСТУХ][\\s][0-9]{3}[\\s][АВЕКМНОРСТУХ]{2}[\\s]([0-9]{2}[\\s]RUS|[0-9]{2}[\\s]RUS)$";
//public Engine (int pwrEngine, String serialNumber, double valueEngine, int eatingFuel, String typeOfFuel, int cntCilinders){

//public Car(String Marka, Car.TypesAuto typeAuto, String ColorAuto, Integer CntWheels, Car.Engine engine);
        Car.Engine engine1 = new Car.Engine(540, "12345", 5.4, 300, "ДТ", 6);

        Car auto1 = new Car("KaMaZ", Car.TypesAuto.Airplane, "Yellow", 6, engine1 );


        System.out.print("\nСоздано авто!\n");

        while (jobTask1) {
            System.out.println("\n" +
                    "\n0 - выход" +
                    "\n1 - добавить регистрационный знак" +
                    "\n2 - поменять цвет машины" +
                    "\n3 - поменять мощность двигателя" +
                    "\n4 - поменять объём двигателя" +
                    "\n5 - поменять расход двигателя" +
                    "\n6 - Вывести информацию об авто" +
                    "\n");

            System.out.println("\n\nВведите номер задания:");
            Integer zadan1 = in.nextInt();
            switch (zadan1) {
                case 0: {
                    System.out.println("\nВыход из меню\n");
                    jobTask1 = false;
                    break;
                }
                case 1: {
                    System.out.println("\nВведите регистрационный номер авто формата \"X 000 XX 00 RUS или X 000 XX 000 RUS\"\n");
                    String regZn = in.next();
                    if (regZn.matches(regex)) {
                        auto1.setRegZnak(regZn);
                    } else {
                        System.out.println("Вы ввели неверный Знак!");
                        break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите новый цвет для авто:..");
                    String colorAuto = in.next();
                    auto1.setColorAuto(colorAuto);
                    break;
                }
                case 3: {
                    System.out.println("Введите новую мощность двигателя:..");
                    Integer cntHourses = in.nextInt();
                    engine1.set_pwrEngine(cntHourses);
                    break;
                }
                case 4: {
                    System.out.println("Введите новый объём двигателя:..");
                    int valueEngine = in.nextInt();
                    engine1.set_valueEngine(valueEngine);
                }
                case 5: {
                    System.out.println("Введите новый расход двигателя:..");
                    int eatEngine = in.nextInt();
                    engine1.set_eatingFuel(eatEngine);
                }
                case 6: {
                    auto1.getAllInfo();
                }


            }
        }
    }

    static void task2() {
    }

    static void task3() {
    }

    static void task4() {
/*
        Scanner in = new Scanner(System.in);
        boolean jobTask1 = true;
        String regex = "^[АВЕКМНОРСТУХ][\\s][0-9]{3}[\\s][АВЕКМНОРСТУХ]{2}[\\s]([0-9]{2}[\\s]RUS|[0-9]{2}[\\s]RUS)$";


      //  Car auto1 = new Car("KaMaZ", Car.TypesAuto.Airplane, "Yellow", 340, "pipaPopa", 3.6, 130, "ДТ", 6, 6);
        System.out.print("\nСоздано авто!\n");


        while (jobTask1) {
            System.out.println("\n" +
                    "\n0 - выход" +
                    "\n1 - добавить регистрационный знак" +
                    "\n2 - поменять цвет машины" +
                    "\n3 - посменять мощность двигателя" +
                    "\n4 -  " +
                    "\n5 -  " +
                    "\n6 -  " +
                    "\n7 -  " +
                    "\nn - Вывести информацию об авто" +
                    "\n");

            System.out.println("\n\nВведите номер задания:");
            int zadan1 = in.nextInt();
            switch (zadan1) {
                case 0: {
                    System.out.println("\nВыход из меню\n");
                    jobTask1 = false;
                    break;
                }
                case 1: {
                    System.out.println("\nВведите регистрационный номер авто формата \"X 000 XX 00 RUS или X 000 XX 000 RUS\"\n");
                    String regZn = in.next();
                    if (regZn.matches(regex)) {
                        setRegZnak(regZn);
                    } else {
                        System.out.println("Вы ввели неверный Знак!");
                        break;
                    }
                    break;


                }
            }
        }
*/
    }
    static void task5() {
    }

    static void task6() {

    }

    static void task7() {
    }

    static void task8() {
    }

    static void task9() {
    }

    static void task10() {
    }
}
