package com.princeton.week2;

public class InstanceControl {

	public static void main(String[] args) {
		//Bmw
        ICar C1 = CarFactory.getCarInstance(1);
        C1.getCarModel();
        C1.getCarColor();
        
        ICar C2 = CarFactory.getCarInstance(2);
        C2.getCarModel();
        C2.getCarColor();
        
        ICar C3 = CarFactory.getCarInstance(3);
        C3.getCarModel();
        C3.getCarColor();
        
        ICar C4 = CarFactory.getCarInstance(4);
        C4.getCarModel();
        C4.getCarColor();
	}

}


interface ICar {
    void getCarModel();

    void getCarColor();
}

class Audi implements ICar {
    @Override
    public void getCarModel() {
        System.out.println("Audi A6");
    }

    @Override
    public void getCarColor() {
        System.out.println("Black");
    }
}
class Bmw implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("BWM, 5 Series");
    }

    @Override
    public void getCarColor() {
        System.out.println("White");
    }
}
class Chevy implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("Chevy 4x4");
    }

    @Override
    public void getCarColor() {
        System.out.println("Red");
    }
}
class Dodge implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("Dodge Rover");
    }

    @Override
    public void getCarColor() {
        System.out.println("Gray");
    }
}
class CarFactory {
    public static ICar getCarInstance(int id) {
        switch (id) {
            case 1:
                return new Audi();
            case 2:
                return new Bmw();
            case 3:
            	return new Chevy();
            case 4:
            	return new Dodge();
            default:
                return null;
        }
    }
}