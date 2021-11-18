package chap06;

public class CarSpeedExample {
    public static void main(String[] args) {
        CarSpeed myCar = new CarSpeed();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도 : " + speed + "km/h");
    }
}
