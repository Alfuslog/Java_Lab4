import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean rab = true;

        System.out.print("Для выхода введите \"0\"\n");
        while (rab) {
            System.out.println("\n\nВведите номер задания:");
            int zadan = in.nextInt();
            switch (zadan) {
                case 0: {
                    System.out.println("\n\nПрограмма завершена!\nСпасибо за использование!!");
                    rab = false;
                    break;
                }
                case 1: { task1(); break; }
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
        Engine engine1 = new Engine(540, "12345", 5.4, 300, "ДТ", 6);
        PassangerCar auto0 = new PassangerCar("Лада", "Синяя", engine1);

        System.out.print("\nСоздано авто!\n");

        while (jobTask1) {
            System.out.println(
                    "\n0 - выход" +
                            "\n1 - добавить регистрационный знак" +
                            "\n2 - поменять цвет машины" +
                            "\n3 - поменять мощность двигателя" +
                            "\n4 - поменять объём двигателя" +
                            "\n5 - поменять расход двигателя" +
                            "\n6 - Вывести информацию об авто\n"
            );
            System.out.print("Введите номер операции: ");
            int zadan1 = in.nextInt();

            switch (zadan1) {
                case 0:
                    System.out.println("Выход из меню\n");
                    jobTask1 = false;
                    break;

                case 1:
                    in.nextLine();
                    System.out.println("Введите регистрационный номер авто (формат: X 000 XX 00 RUS или X 000 XX 000 RUS):");
                    String regZn = in.nextLine().trim();
                    auto0.setRegZnak(regZn);
                    break;

                case 2:
                    System.out.print("Введите новый цвет для авто: ");
                    String colorAuto = in.next();
                    auto0.setColorAuto(colorAuto);
                    break;
                case 3: {
                    System.out.println("Введите новую мощность двигателя: ");
                    Integer cntHourses = in.nextInt();
                    engine1.setPwrEngine(cntHourses);
                    break;
                }
                case 4: {
                    System.out.println("Введите новый объём двигателя: ");
                    int valueEngine = in.nextInt();
                    engine1.setValueEngine(valueEngine);
                    break;
                }
                case 5: {
                    System.out.println("Введите новый расход двигателя: ");
                    int eatEngine = in.nextInt();
                    engine1.setEatingFuel(eatEngine);
                    break;
                }
                case 6: {
                    auto0.getAllInfo();
                    break;
                }
                default:
                    System.out.println("Некорректный выбор!");
            }
        }
    }

    static void task2() {

        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, -2);

        System.out.println("z1 = " + z1.toAlgebraicForm());
        System.out.println("z2 = " + z2.toAlgebraicForm());

        System.out.println("Сумма: " + z1.add(z2));
        System.out.println("Разность: " + z1.subtract(z2));
        System.out.println("Произведение: " + z1.multiply(z2));
        System.out.println("Частное: " + z1.divide(z2));

        System.out.println("Тригонометрическая форма z1: " + z1.toTrigonometricForm());

        System.out.println("exp(z1): " + Complex.exp(z1));
        System.out.println("sin(z1): " + Complex.sin(z1));
        System.out.println("cos(z1): " + Complex.cos(z1));
    }
    static void task3() {  }
    static void task4() {  }
    static void task5() {  }
    static void task6() {  }
    static void task7() {  }
    static void task8() {  }
    static void task9() {  }
    static void task10() {  }

    static class Engine {
        private int pwrEngine;
        private String engineNum;
        private double valueEngine;
        private int eatingFuel;
        private String typeFuel;
        private int cntWheels;

        public Engine(int pwrEngine, String engineNum, double valueEngine, int eatingFuel, String typeFuel, int cntWheels) {
            this.pwrEngine = pwrEngine;
            this.engineNum = engineNum;
            this.valueEngine = valueEngine;
            this.eatingFuel = eatingFuel;
            this.typeFuel = typeFuel;
            this.cntWheels = cntWheels;
        }

        public void setPwrEngine(int pwrEngine) { this.pwrEngine = pwrEngine; }
        public void setValueEngine(double valueEngine) { this.valueEngine = valueEngine; }
        public void setEatingFuel(int eatingFuel) { this.eatingFuel = eatingFuel; }

        public void getInfo() {
            System.out.println("Мощность двигателя: " + this.pwrEngine + " л.с.");
            System.out.println("Объём двигателя: " + this.valueEngine + " л.");
            System.out.println("Расход топлива: " + this.eatingFuel + " л/100км");
            System.out.println("Тип топлива: " + this.typeFuel);
            System.out.println("Номер двигателя: " + this.engineNum);
        }
    }

    static class Car {
        protected String regZnak;
        protected String Marka;
        protected String ColorAuto;
        protected Engine engine;
        protected String typeAuto;
        protected int CntWheels;

        public void setRegZnak(String regZnak) { this.regZnak = regZnak; }
        public void setColorAuto(String colorAuto) { this.ColorAuto = colorAuto; }

        public void getAllInfo() {
            System.out.println("Марка: " + this.Marka);
            System.out.println("Цвет: " + this.ColorAuto);
            System.out.println("Рег. номер: " + this.regZnak);
            System.out.println("Тип авто: " + this.typeAuto);
            System.out.println("Количество колёс: " + this.CntWheels);
            System.out.println("Двигатель: ");
            this.engine.getInfo();
        }
    }

    static class PassangerCar extends Car {
        public PassangerCar(String Marka, String ColorAuto, Engine engine) {
            this.regZnak = "Undefined";
            this.Marka = Marka;
            this.ColorAuto = ColorAuto;
            this.engine = engine;
            this.typeAuto = "Легковой автомобиль";
            this.CntWheels = 4;
        }

        public PassangerCar(String RegZnak, String Marka, String ColorAuto, Engine engine) {
            this.regZnak = RegZnak;
            this.Marka = Marka;
            this.ColorAuto = ColorAuto;
            this.engine = engine;
            this.typeAuto = "Легковой автомобиль";
            this.CntWheels = 4;
        }
    }

    static class DiplomaticAuto extends Car {
        public String typeAuto = "Дипломатическое авто";
        protected String regex = "^[АВЕКМНОРСТУХ][\\s][0-9]{1}[\\s][АВЕКМНОРСТУХ]{1}[\\s]([0-9]{1}[\\s]RUS|[0-9]{1}[\\s]RUS)$";

        public DiplomaticAuto(String Marka, String ColorAuto, Integer CntWheels, Engine engine) {
            this.regZnak = "Undefined";
            this.Marka = Marka;
            this.ColorAuto = ColorAuto;
            this.CntWheels = CntWheels;
            this.engine = engine;
            this.typeAuto = "Дипломатическое авто";
            this.regex = "^[АВЕКМНОРСТУХ]\\s\\d{3}\\s[АВЕКМНОРСТУХ]{2}\\s\\d{2,3}\\sRUS$";
        }

        public DiplomaticAuto(String RegZnak, String Marka, String ColorAuto, Integer CntWheels, Engine engine) {
            this.regZnak = RegZnak;
            this.Marka = Marka;
            this.ColorAuto = ColorAuto;
            this.CntWheels = CntWheels;
            this.engine = engine;
            this.typeAuto = "Дипломатическое авто";
            this.regex = "^[АВЕКМНОРСТУХ]\\s\\d{3}\\s[АВЕКМНОРСТУХ]{2}\\s\\d{2,3}\\sRUS$";
        }
    }
    static class Complex {
        private final double real; // действительная часть
        private final double imaginary; // мнимая часть

        // Конструкторы
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public Complex(double real) {
            this(real, 0.0);
        }

        public Complex() {
            this(0.0, 0.0);
        }

        // Геттеры
        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }

        // Основные операции
        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imaginary + other.imaginary);
        }

        public Complex add(double real) {
            return new Complex(this.real + real, this.imaginary);
        }

        public Complex subtract(Complex other) {
            return new Complex(this.real - other.real, this.imaginary - other.imaginary);
        }

        public Complex subtract(double real) {
            return new Complex(this.real - real, this.imaginary);
        }

        public Complex multiply(Complex other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(newReal, newImaginary);
        }

        public Complex multiply(double scalar) {
            return new Complex(this.real * scalar, this.imaginary * scalar);
        }

        public Complex divide(Complex other) {
            double denominator = other.real * other.real + other.imaginary * other.imaginary;
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }
            double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
            double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
            return new Complex(newReal, newImaginary);
        }

        public Complex divide(double scalar) {
            if (scalar == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return new Complex(this.real / scalar, this.imaginary / scalar);
        }

        // Комплексное сопряжение
        public Complex conjugate() {
            return new Complex(this.real, -this.imaginary);
        }

        // Модуль числа
        public double modulus() {
            return Math.sqrt(real * real + imaginary * imaginary);
        }

        // Аргумент числа (в радианах)
        public double argument() {
            return Math.atan2(imaginary, real);
        }

        // Проверка на равенство
        public boolean equals(Complex other) {
            return this.real == other.real && this.imaginary == other.imaginary;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Complex other = (Complex) obj;
            return equals(other);
        }

        @Override
        public int hashCode() {
            return Double.hashCode(real) ^ Double.hashCode(imaginary);
        }

        // Представление в алгебраической форме
        public String toAlgebraicForm() {
            if (imaginary == 0) return String.format("%.2f", real);
            if (real == 0) return String.format("%.2fi", imaginary);
            return String.format("%.2f %s %.2fi",
                    real,
                    imaginary > 0 ? "+" : "-",
                    Math.abs(imaginary));
        }

        // Представление в тригонометрической форме
        public String toTrigonometricForm() {
            double r = modulus();
            double phi = argument();
            return String.format("%.2f*(cos(%.2f) + i*sin(%.2f))", r, phi, phi);
        }

        @Override
        public String toString() {
            return toAlgebraicForm();
        }

        // Статические методы для элементарных функций
        public static Complex exp(Complex z) {
            double expReal = Math.exp(z.real);
            return new Complex(
                    expReal * Math.cos(z.imaginary),
                    expReal * Math.sin(z.imaginary)
            );
        }

        public static Complex sin(Complex z) {
            Complex iz = new Complex(-z.imaginary, z.real); // i*z
            Complex eiz = exp(iz);
            Complex eMinusIz = exp(iz.multiply(-1));
            return eiz.subtract(eMinusIz).divide(2 * Math.E).multiply(Math.E); // (e^(iz) - e^(-iz))/(2i)
        }

        public static Complex cos(Complex z) {
            Complex iz = new Complex(-z.imaginary, z.real); // i*z
            Complex eiz = exp(iz);
            Complex eMinusIz = exp(iz.multiply(-1));
            return eiz.add(eMinusIz).divide(2);
        }

        public static Complex tan(Complex z) {
            return sin(z).divide(cos(z));
        }

        public static Complex cot(Complex z) {
            return cos(z).divide(sin(z));
        }

        public static Complex sinh(Complex z) {
            Complex ez = exp(z);
            Complex eMinusZ = exp(z.multiply(-1));
            return ez.subtract(eMinusZ).divide(2);
        }

        public static Complex cosh(Complex z) {
            Complex ez = exp(z);
            Complex eMinusZ = exp(z.multiply(-1));
            return ez.add(eMinusZ).divide(2);
        }

        public static Complex tanh(Complex z) {
            return sinh(z).divide(cosh(z));
        }

        public static Complex coth(Complex z) {
            return cosh(z).divide(sinh(z));
        }

        // Формула Эйлера для действительного числа
        public static Complex eulerFormula(double x) {
            return new Complex(Math.cos(x), Math.sin(x));
        }
    }
}
