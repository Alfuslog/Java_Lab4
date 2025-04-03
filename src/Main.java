import java.util.Scanner;

class Car {
    public enum TypesAuto{LightAuto, Abobus, Gruzovik, Airplane}

    private String regZnak;
    private String Marka;
    private TypesAuto TypeAuto;
    private String ColorAuto;
    private Integer PowerEngine;
    private Integer CntWheels;

    public Car(String Marka, TypesAuto typeAuto, String ColorAuto, Integer PowerEngine, Integer CntWheels){
        this.regZnak = "Undefined";
        this.Marka = Marka;
        this.TypeAuto = TypeAuto;
        this.ColorAuto = ColorAuto;
        this.PowerEngine = PowerEngine;
        this.CntWheels = CntWheels;
    }
    public Car(String RegZnak, String Marka, TypesAuto typeAuto, String ColorAuto, Integer PowerEngine, Integer CntWheels){
        this.regZnak = RegZnak;
        this.Marka = Marka;
        this.TypeAuto = TypeAuto;
        this.ColorAuto = ColorAuto;
        this.PowerEngine = PowerEngine;
        this.CntWheels = CntWheels;
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

    public void getRegZnak(){
        System.out.println(this.regZnak);
    }

}


class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);




        Car auto1 = new Car( "mazda", Car.TypesAuto.LightAuto, "blue", 211, 4);
        auto1.getRegZnak();
    }
}