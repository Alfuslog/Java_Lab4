package com.myproject

class Car14 {

    public enum TypesAuto{LightAuto, Abobus, Gruzovik, Airplane}

    private String regZnak;
    private String Marka;
    private TypesAuto TypeAuto;
    private String ColorAuto;
    private Integer CntWheels;
    private Engine engine;

    static class Engine {
        private Integer pwrEngine;
        private String serialNumber;
        private double valueEngine;
        private int eatingFuel;
        private String typeOfFuel;
        private int cntCilinders;

        public Engine (int pwrEngine, String serialNumber, double valueEngine, int eatingFuel, String typeOfFuel, int cntCilinders){
            this.pwrEngine = pwrEngine;
            this.serialNumber = serialNumber;
            this.valueEngine = valueEngine;
            this.eatingFuel = eatingFuel;
            this.typeOfFuel = typeOfFuel;
            this.cntCilinders = cntCilinders;
        }
        public void getEngineInfo(){
            System.out.println("\n" +
                    "\nPwrEngine - " + pwrEngine +
                    "\nserialNumber - " + serialNumber +
                    "\nvalueEngine - " + valueEngine +
                    "\neatingFuel - " + eatingFuel +
                    "\ntypeOfFuel - " + typeOfFuel +
                    "\ncntCilinders - " + cntCilinders +
                    "\n");
        }

        public void set_pwrEngine(int new_pwrEngine){
            this.pwrEngine = new_pwrEngine;
        }

        public void set_valueEngine(double new_valueEngine){
            this.valueEngine = new_valueEngine;
        }

        public void set_eatingFuel(int new_eatingFuel){
            this.eatingFuel = new_eatingFuel;
        }
    }
    public Car(String Marka, TypesAuto typeAuto, String ColorAuto, Integer CntWheels, Engine engine){
        this.regZnak = "Undefined";
        this.Marka = Marka;
        this.TypeAuto = typeAuto;
        this.ColorAuto = ColorAuto;
        this.CntWheels = CntWheels;
        this.engine = engine;
    }

    public Car(String RegZnak, String Marka, TypesAuto typeAuto, String ColorAuto, Integer CntWheels, Engine engine) {
        this.regZnak = RegZnak;
        this.Marka = Marka;
        this.TypeAuto = typeAuto;
        this.ColorAuto = ColorAuto;
        this.CntWheels = CntWheels;
        this.engine = engine;
    }

    public void set_CarPwrEngine(int new_pwrEngine){
        engine.set_pwrEngine(new_pwrEngine);
    }

    public void set_CarValueEngine(double new_valueEngine){
        engine.set_valueEngine(new_valueEngine);
    }

    public void set_CarEatingFuel(int new_eatingFuel){
        engine.set_eatingFuel(new_eatingFuel);
    }



    public void setRegZnak(String regZnak){
        this.regZnak = regZnak;
    }
    public void setColorAuto(String ColorAuto){
        this.ColorAuto = ColorAuto;
    }


    public void getAllInfo() {

        System.out.println("регзнак - " + this.regZnak);
        System.out.println("Марка - " + this.Marka);
        System.out.println("тип авто - " + this.TypeAuto);
        System.out.println("цвет - " + this.ColorAuto);
        System.out.println("количество колёс - " + this.CntWheels);

        engine.getEngineInfo();
    }
}