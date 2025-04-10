import java.util.Scanner;


class Car {
    public enum TypesAuto{LightAuto, Abobus, Gruzovik, Airplane}


    private String regZnak;
    private String Marka;
    private TypesAuto TypeAuto;
    private String ColorAuto;
    private Integer PowerEngine;
    private Integer CntWheels;

    private TypesAuto typeAuto;
    private Engine engine;

    class Engine {
        private int PwrEngine;
        private String serialNumber;
        private int valueEngine;
        private int eatingFuel;
        private String typeOfFuel;
        private int cntCilinders;

        private Engine (int pwrEngine, String serialNumber, int valueEngine, int eatingFuel, String typeOfFuel, int cntCilinders){
            this.PwrEngine = PwrEngine;
            this.serialNumber = serialNumber;
            this.valueEngine = valueEngine;
            this.eatingFuel = eatingFuel;
            this.typeOfFuel = typeOfFuel;
            this.cntCilinders = cntCilinders;
        }
        public void getEngineInfo(){
            System.out.println("\n" +
                    "\nPwrEngine - " + PwrEngine +
                    "\nserialNumber - " + serialNumber +
                    "\nvalueEngine - " + valueEngine +
                    "\neatingFuel - " + eatingFuel +
                    "\ntypeOfFuel - " + typeOfFuel +
                    "\ncntCilinders - " + cntCilinders +
                    "\n");
        }
    }



    public Car(String Marka, TypesAuto typeAuto, String ColorAuto, Integer PowerEngine, Integer CntWheels){
        this.regZnak = "Undefined";
        this.Marka = Marka;
        this.typeAuto = typeAuto;
        this.ColorAuto = ColorAuto;
        this.PowerEngine = PowerEngine;
        this.CntWheels = CntWheels;
    }
    public Car(String RegZnak, String Marka, TypesAuto typeAuto, String ColorAuto, Integer PowerEngine, Integer CntWheels){
        this.regZnak = RegZnak;
        this.Marka = Marka;
        this.typeAuto = typeAuto;
        this.ColorAuto = ColorAuto;
        this.PowerEngine = PowerEngine;
        this.CntWheels = CntWheels;
    }
    public Car(String RegZnak, String Marka, TypesAuto typeAuto, String ColorAuto, int pwrEngine, String serialNumber, int valueEngine, int eatingFuel, String typeOfFuel, int cntCilinders, Integer CntWheels){
        this.regZnak = RegZnak;
        this.Marka = Marka;
        this.typeAuto = typeAuto;
        this.ColorAuto = ColorAuto;
        this.CntWheels = CntWheels;
        this.engine = new Engine (pwrEngine, serialNumber, valueEngine, eatingFuel, typeOfFuel, cntCilinders);

    }
    public Car(String Marka, TypesAuto typeAuto, String ColorAuto, int pwrEngine, String serialNumber, int valueEngine, int eatingFuel, String typeOfFuel, int cntCilinders, Integer CntWheels){
        this.regZnak = "Undefined";
        this.Marka = Marka;
        this.TypeAuto = typeAuto;
        this.ColorAuto = ColorAuto;
        this.CntWheels = CntWheels;
        this.engine = new Engine (pwrEngine, serialNumber, valueEngine, eatingFuel, typeOfFuel, cntCilinders);

    }

    public void setRegZnak(String regZnak){
        this.regZnak = regZnak;
    }
    public void setColorAuto(String ColorAuto){
        this.ColorAuto = ColorAuto;
    }
    public void setPowerEngine(Integer PowerEngine){
        this.PowerEngine = PowerEngine;
    }

    public void getAllInfo(int type) {
        if (type == 1) {
            System.out.println("регзнак - " + this.regZnak);
            System.out.println("Марка - " + this.Marka);
            System.out.println("тип авто - " + this.TypeAuto);
            System.out.println("цвет - " + this.ColorAuto);
            System.out.println("количество колёс - " + this.CntWheels);
        }
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean rab = true;

        System.out.print(" Для выхода введите \"0\" \n");

        while (rab){
            System.out.println("\n\nВведите номер задания:");
            int zadan = in.nextInt();
            switch (zadan){
                case 0:{
                    System.out.println("\n\nПрограмма завершена!\nСпасибо за использование!!");
                    rab = false;
                    break;
                }
                case 1: {task1(); break;}
                case 2: {task2(); break;}
                case 3: {task3(); break;}
                case 4: {task4(); break;}
                case 5: {task5(); break;}
                case 6: {task6(); break;}
                case 7: {task7(); break;}
                case 8: {task8(); break;}
                case 9: {task9(); break;}
                case 10: {task10(); break;}
                default: System.out.println("Введено некорректное значение!");
            }
        }
        in.close();
    }

    static void task1(){
        Scanner in = new Scanner(System.in);
        boolean jobTask1 = true;
        String regex = "^[АВЕКМНОРСТУХ][\\s][0-9]{3}[\\s][АВЕКМНОРСТУХ]{2}[\\s]([0-9]{2}[\\s]RUS|[0-9]{2}[\\s]RUS)$";



        Car auto1 = new Car("KaMaZ", Car.TypesAuto.Airplane, "Yellow", 340, 6);
        System.out.print("\nСоздано авто!\n");



        while (jobTask1) {
            System.out.println("\n" +
                    "\n0 - выход"+
                    "\n1 - добавить регистрационный знак" +
                    "\n2 - поменять цвет машины" +
                    "\n3 - посменять мощность двигателя" +
                    "\n4 - Вывести информацию об авто" +
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
                    if (regZn.matches(regex)){
                        auto1.setRegZnak(regZn);
                    }
                    else{
                        System.out.println("Вы ввели неверный Знак!");
                        break;
                    }
                    break;
                }
                case 2:{
                    System.out.println("Введите новый цвет для авто:..");
                    String colorAuto = in.next();
                    auto1.setColorAuto(colorAuto);
                    break;
                }
                case 3:{
                    System.out.println("Введите новую мощность двигателя:..");
                    Integer cntHourses = in.nextInt();
                    auto1.setPowerEngine(cntHourses);
                    break;
                }
                case 4:{
                    auto1.getAllInfo();
                }


            }
        }
    }

    static void task2(){}

    static void task3(){
    }

    static void task4() {

        Scanner in = new Scanner(System.in);
        boolean jobTask1 = true;
        String regex = "^[АВЕКМНОРСТУХ][\\s][0-9]{3}[\\s][АВЕКМНОРСТУХ]{2}[\\s]([0-9]{2}[\\s]RUS|[0-9]{2}[\\s]RUS)$";


        private Engine (int pwrEngine, String serialNumber, int valueEngine, int eatingFuel, String typeOfFuel, int cntCilinders)
        Car auto1 = new Car("KaMaZ", Car.TypesAuto.Airplane, "Yellow", 340, 6);
        System.out.print("\nСоздано авто!\n");


        while (jobTask1) {
            System.out.println("\n" +
                    "\n0 - выход" +
                    "\n1 - добавить регистрационный знак" +
                    "\n2 - поменять цвет машины" +
                    "\n3 - посменять мощность двигателя" +
                    "\n4 - " +
                    "\n5 -  " +
                    "\n6 -  " +
                    "\n7 -  " +
                    "\nn - Вывести информацию об авто" +
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
            }
        }
    }


    static void task5(){
    }

    static void task6(){

    }

    static void task7(){
    }

    static void task8(){
    }

    static void task9(){
    }
    static void task10(){
    }
}